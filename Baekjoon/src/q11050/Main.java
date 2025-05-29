package src.q11050;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 05. 09.
 * @Description : 백준 11050
 * @Link : https://www.acmicpc.net/problem/11050
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // n 입력
        int k = scanner.nextInt(); // k 입력
        scanner.close();

        // n! / (k! * (n-k)!)
        int result = factorial(n) / (factorial(k) * factorial(n - k)); // 이항 계수 조합식
        System.out.println(result); // 결과 출력
    }

    // 팩토리얼 함수
    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * factorial(n - 1); // 재귀 호출
    }
}
