package src.q1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 16.
 * * @Description : 백준 1260
 * * @Link : https://www.acmicpc.net/problem/1260
 */
public class Main {
    static ArrayList<Integer>[] adj;    // 인접 리스트
    static boolean[] visited;    // 방문 여부
    static StringBuilder sb = new StringBuilder();    // 결과 저장용

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());    // 정점
            int m = Integer.parseInt(st.nextToken());    // 간선
            int v = Integer.parseInt(st.nextToken());    // 시작 정점

            // 인접 리스트 초기화
            adj = new ArrayList[n + 1];
            for(int i = 1; i <= n; i++) {
                adj[i] = new ArrayList<>();
            }

            // 양방향 간선 정보 입력
            for(int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());    // 간선 입력
                int vertex1 = Integer.parseInt(st.nextToken());    // 정점1
                int vertex2 = Integer.parseInt(st.nextToken());    // 정점2
                adj[vertex1].add(vertex2);    // 정점1에서 정점2로 가는 간선 추가
                adj[vertex2].add(vertex1);    // 정점2에서 정점1로 가는 간선 추가
            }

            // 작은 번호 우선 조건 충족을 위한 인접 리스트 정렬
            for (int i = 1; i <= n; i++) {
                Collections.sort(adj[i]);
            }

            // DFS 수행
            visited = new boolean[n + 1];    // 방문 여부 배열 초기화
            dfs(v);    // 깊이 우선 탐색 시작
            sb.append("\n");    // 결과 저장

            // BFS 수행
            visited = new boolean[n + 1];   // 방문 여부 배열 초기화
            bfs(v);    // 너비 우선 탐색 시작

            System.out.print(sb);    // 결과 출력

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // DFS
    public static void dfs(int node) {
        visited[node] = true;    // 현재 정점 방문 처리
        sb.append(node).append(" ");    // 결과 저장

        for(int next : adj[node]) {    // 인접한 정점들 탐색
            if(!visited[next]) {    // 아직 방문하지 않은 정점인 경우
                dfs(next);    // 재귀적으로 DFS 호출
            }
        }
    }

    // BFS
    public static void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);    // 시작 노드를 큐에 넣음
        visited[startNode] = true;    // 큐에 넣을 때 방문 처리

        while (!queue.isEmpty()) {
            int node = queue.poll();    // 큐에서 하나 꺼냄
            sb.append(node).append(" ");

            // 꺼낸 노드와 연결된 모든 노드를 큐에 넣음
            for (int nextNode : adj[node]) {
                if (!visited[nextNode]) {    // 아직 방문하지 않았다면
                    visited[nextNode] = true;    // 방문 처리
                    queue.add(nextNode);
                }
            }

        }

    }

}
