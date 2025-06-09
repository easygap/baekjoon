package src.q1003;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 06. 02.
 * @Description : 백준 1003
 * @Link : https://www.acmicpc.net/problem/1003
 */
public class Main {
    static int[][] dp = new int[41][2]; // dp 배열 초기화

    public static void main(String[] args) {
        dp[0][0] = 1; // 0번째 피보나치 수의 0 호출 횟수
        dp[0][1] = 0; // 0번째 피보나치 수의 1 호출 횟수
        dp[1][0] = 0; // 1번째 피보나치 수의 0 호출 횟수
        dp[1][1] = 1; // 1번째 피보나치 수의 1 호출 횟수

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt(); // 테스트 케이스의 개수

        for(int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0]; // 0 호출 횟수
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1]; // 1 호출 횟수
        }

        for(int i = 0; i < t; i++) {
            int caseNum = sc.nextInt(); // 테스트 케이스
            sb.append(dp[caseNum][0]).append(" ").append(dp[caseNum][1]).append("\n"); // 결과 저장
        }

        sc.close(); // Scanner 객체 종료
        System.out.println(sb); // 결과 출력
    }
}
