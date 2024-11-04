package src.q1149;

import java.util.Scanner;

/*
 * Author: ljs
 * Date: 2024. 11. 04.
 * Description: 백준 1149 RGB거리
 * Link: https://www.acmicpc.net/problem/1149
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int house = sc.nextInt(); // 집의 수
        int[][] cost = new int[house][3]; // 비용 배열
        int[][] dp; // dp 배열
        dp = cost; // dp 배열 초기화

        // 비용 입력
        for (int i = 0; i < house; i++) {
            for(int j = 0; j < 3; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // 첫번째 집 비용 초기화
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        // dp 배열 계산
        for(int i = 1; i < house; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0]; // 빨강
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1]; // 초록
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2]; // 파랑
        }

        System.out.println(Math.min(Math.min(dp[house - 1][0], dp[house - 1][1]), dp[house - 1][2])); // 최소 비용 출력
    }
}
