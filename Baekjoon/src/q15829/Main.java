package src.q15829;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 04. 25.
 * @Description : 백준 15829
 * @Link : https://www.acmicpc.net/problem/15829
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); // 문자열 길이
        String s = sc.next(); // 문자열 입력
        long result = 0; // 해시값 초기화
        int m = 1234567891; // 소수

        for (int i = 0; i < l; i++) {
            result += (long)((s.charAt(i) - 'a' + 1) * (Math.pow(31, i) % m)); // 해시값 계산
        }
        System.out.println(result); // 결과 출력
    }
}
