package src.q16173;

import java.io.*;
import java.util.StringTokenizer;

/*
 * @Author : ljs
 * @Date : 2024. 11. 06.
 * @Description : 백준 16173 점프왕 쩰리 (Small)
 * @Link : https://www.acmicpc.net/problem/16173
 */
public class Main {
    static int N; // N x N 크기의 게임판
    static int[][] graph; // 게임판
    static boolean[][] visited; // 방문 여부

    public static void dfs(int x, int y) {
        if(x < 0 || x >= N || y < 0 || y >= N) { // 범위를 벗어나면
            return;
        }
        if(graph[x][y] == 0) { // 0이면
            return;
        }
        if(visited[x][y]) { // 방문했던 곳이면
            return;
        }
        visited[x][y] = true; // 방문 여부 true로 변경
        dfs(x + graph[x][y], y); // 오른쪽으로 이동
        dfs(x, y + graph[x][y]); // 아래로 이동
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in))); // 입력을 위한 버퍼 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out))); // 출력을 위한 버퍼 선언

        N = Integer.parseInt(br.readLine()); // N x N 크기의 게임판
        visited = new boolean[N][N]; // 방문 여부
        graph = new int[N][N]; // 게임판 초기화

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 입력을 공백으로 구분
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken()); // 게임판 입력
            }
        }

        dfs(0, 0); // 0, 0부터 시작

        if (visited[N - 1][N - 1]) { // 마지막 칸에 도착했다면
            bw.write("HaruHaru"); // HaruHaru 출력
        } else {
            bw.write("Hing"); // Hing 출력
        }

        br.close(); // 스트림을 닫음
        bw.close(); // 스트림을 닫음
    }
}