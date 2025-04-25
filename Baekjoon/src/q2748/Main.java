package src.q2748;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 04. 24.
 * @Description : 백준 2748
 * @Link : https://www.acmicpc.net/problem/2748
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력 받을 정수
        long[] fib = new long[n+1]; // 피보나치 수열을 저장할 배열 생성

        fib[0] = 0; // 첫 번째 피보나치 수
        fib[1] = 1; // 두 번째 피보나치 수

        for(int i = 2; i <= n; i++) {
            fib[i] = fibonacci(fib, i); // 피보나치 수 계산
        }
        System.out.println(fib[n]); // 결과 출력
    }

    private static long fibonacci(long[] f, int n) {
        return f[n - 1] + f[n - 2];
    }
}
