package src.q27433;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 05. 09.
 * @Description : 백준 27433
 * @Link : https://www.acmicpc.net/problem/27433
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수 N 입력
        int loop = n; // 반복문을 위한 변수 초기화

        BigInteger factorial = BigInteger.valueOf(1); // 팩토리얼 결과값 초기화

        for (int i = 0; i < loop; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(n)); // 팩토리얼 계산
            n--; // N을 1 감소
        }

        System.out.println(factorial); // 결과 출력
    }
}
