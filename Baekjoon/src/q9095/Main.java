package src.q9095;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 06. 02.
 * @Description : 백준 9095
 * @Link : https://www.acmicpc.net/problem/9095
 */
public class Main {
    public static void main(String[] args) {
        int dp[] = new int[11]; // 1보다 작은 경우의 수

        dp[1] = 1; // 1을 만드는 경우
        dp[2] = 2; // 2를 만드는 경우
        dp[3] = 4; // 3을 만드는 경우

        for(int i = 4; i < 11; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt(); // 테이스 케이스 개수

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt(); // 정수 n
            sb.append(dp[n]).append("\n");
        }
        sc.close(); // Scanner 객체 종료
        System.out.println(sb);
    }
}
