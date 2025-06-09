package src.q11047;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 05. 30.
 * @Description : 백준 11047
 * @Link : https://www.acmicpc.net/problem/11047
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동전 종류
        int K = sc.nextInt(); // 최종 금액

        int[] coins = new int[N]; // 동전 종류 배열

        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt(); // 각 동전 금액
        }
        sc.close();

        int count = 0; // 동전 개수

        for(int i = N - 1; i >= 0; i--) { // 액수가 큰 동전부터 사용
            if (K == 0)
                break; // 최종 금액 도달시 종료
            if (coins[i] <= K) { // 현재 동전이 최종 금액 이하라면
                count += K / coins[i]; // 현재 동전을 사용할 수 있는 만큼 사용
                K %= coins[i]; // 남은 금액
            }
        }
        System.out.println(count); // 사용한 동전 개수 출력
    }
}