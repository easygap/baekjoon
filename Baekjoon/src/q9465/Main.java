package q9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @Author : ljs
 * @Date : 2025. 11. 19.
 * @Description : 백준 9465
 * @Link : https://www.acmicpc.net/problem/9465
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());    // 2행 n열
            int arr[][] = new int[N + 1][2];    // 원본 스티커 배열
            int DP[][] = new int[N + 1][2];    // DP 배열


            // 스티커 점수 입력
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[j][i] = Integer.parseInt(st.nextToken());
                }
            }

            // DP 배열 초기화
            DP[0][0] = arr[0][0];
            DP[0][1] = arr[0][1];
            DP[1][0] = DP[0][1] + arr[1][0];
            DP[1][1] = DP[0][0] + arr[1][1];

            for(int i = 2; i < N; i++){
                DP[i][0] = Math.max(DP[i-1][1], DP[i-2][1]) + arr[i][0];    // 1행 최대값
                DP[i][1] = Math.max(DP[i-1][0], DP[i-2][0]) + arr[i][1];    // 2행 최대값
            }
            System.out.println(Math.max(DP[N-1][0], DP[N-1][1]));    // 1행과 2행 중 최대값 출력
        }
    }
}
