package src.q2579;

import java.util.Scanner;

/**
 * * @Author : ljs
 * * @Date : 2025. 06. 30.
 * * @Description : 백준 2579 계단 오르기
 * * @Link : https://www.acmicpc.net/problem/2579
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 계단 개수
        int[] stairs = new int[n + 1];    // 계단 점수 배열

        for(int i = 1; i <= n; i++) {
            stairs[i] = sc.nextInt();    // 계단 점수 입력
        }
        sc.close();    // Scanner 객체 종료

        int[] dp = new int[n + 1];    // dp 배열
        dp[1] = stairs[1];    // 첫 번째 계단 점수
        if(n == 1) {
            System.out.println(dp[1]);
            return;
        }

        dp[2] = stairs[1] + stairs[2];    // 첫 번째 + 두 번째 계단 점수
        if(n == 2) {
            System.out.println(dp[2]);
            return;
        }

        for(int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];    // (2칸 전 + 현재칸) || (3칸 전 + 한칸 전 + 현재 칸) 중에서 큰 값
        }
        System.out.println(dp[n]);    // 최대 점수 출력
    }
}
