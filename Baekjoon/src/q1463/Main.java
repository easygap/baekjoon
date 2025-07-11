package src.q1463;

import java.util.Scanner;

/*
 * @Author : ljs
 * @Date : 2025. 06. 26.
 * @Description : 백준 1463 1로 만들기
 * @Link : https://www.acmicpc.net/problem/1463
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();    // 입력 받을 수
        sc.close();
        int[] dp = new int[num + 1];    // dp 배열
        dp[1] = 0;    // 1일 때는 0
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + 1;    // 1 빼기

            if (i % 2 == 0)    // 2 나누기
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);

            if (i % 3 == 0)    // 3 나누기
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        System.out.println(dp[num]);    // 결과 출력
    }
}
