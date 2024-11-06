package src.q2606;

import java.io.*;
import java.util.StringTokenizer;

/*
 * @Author : ljs
 * @Date : 2024. 11. 06.
 * @Description : 백준 2606 바이러스
 * @Link : https://www.acmicpc.net/problem/2606
 */
public class Main {
    static boolean[][] graph; // 인접행렬
    static boolean[] visited; // 방문 여부
    static int count = 0; // 바이러스에 걸린 컴퓨터 수
    static int n; // 컴퓨터의 수
    static int m; // 연결된 쌍의 수

    // 깊이 우선 탐색
    public static void dfs(int index){
        visited[index] = true; // 방문한 컴퓨터는 true로 변경
        count++; // 바이러스에 걸린 컴퓨터 수 증가
        for(int i = 0; i < n + 1; i++) {
            if(!visited[i] && graph[index][i]) { // 방문하지 않은 컴퓨터이고 연결된 컴퓨터라면
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 위한 버퍼 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위한 버퍼 선언

        n = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        m = Integer.parseInt(br.readLine()); // 연결된 쌍의 수

        graph = new boolean[n + 1][n + 1]; // 인접행렬
        visited = new boolean[n + 1]; // 방문 여부

        // 연결된 쌍 입력
        int x, y;
        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 입력을 공백으로 구분
            x = Integer.parseInt(st.nextToken()); // 첫 번째 컴퓨터
            y = Integer.parseInt(st.nextToken()); // 두 번째 컴퓨터
            graph[x][y] = graph[y][x] = true; // 연결된 컴퓨터는 true로 변경
        }

        dfs(1); // 1번 컴퓨터부터 시작

        bw.write(String.valueOf(count - 1)); // 1번 컴퓨터를 통해 바이러스에 걸리게 되는 컴퓨터 수 출력
        bw.close(); // 스트림을 닫음
        br.close(); // 스트림을 닫음
    }
}
