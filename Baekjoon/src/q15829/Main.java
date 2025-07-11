package src.q15829;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 07. 10.
 * @Description : 백준 15829
 * @Link : https://www.acmicpc.net/problem/15829
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); // 문자열 길이
        String s = sc.next(); // 문자열 입력
        sc.close(); // Scanner 객체 종료

        long result = 0; // 해시값 초기화
        int m = 1234567891; // 소수
        long pow = 1;

        for (int i = 0; i < l; i++) {
            result = (result + (s.charAt(i) - 'a' + 1) * pow) % m; // 해시값 계산
            pow = pow * 31 % m; // 31의 i제곱
        }
        System.out.println(result); // 결과 출력
    }
}
