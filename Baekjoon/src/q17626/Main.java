package src.q17626;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 07. 08.
 * @Description : 백준 17626
 * @Link : https://www.acmicpc.net/problem/17626
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //  자연수 n
        sc.close(); // Scanner 객체 종료

        int[] dp = new int[n + 1]; // dp 배열 생성

        for (int i = 1; i <= n; i++) {
            dp[i] = i; // 최악의 경우

            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1); // 모든 제곱수 시도
            }
        }

        System.out.println(dp[n]); // 결과 출력
    }
}
