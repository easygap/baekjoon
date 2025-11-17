package q9372;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @Author : ljs
 * @Date : 2025. 11. 15.
 * @Description : 백준 9372
 * @Link : https://www.acmicpc.net/problem/9372
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int t = Integer.parseInt(br.readLine());    // 테스트 케이스

            for (int i = 0; i < t; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());    // 국가의 수
                int M = Integer.parseInt(st.nextToken());    // 비행기의 종류

                for (int j = 0; j < M; j++) {    // 간선 읽기
                    br.readLine();
                }

                System.out.println(N - 1);    // 최소 스패닝 트리 출력
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
