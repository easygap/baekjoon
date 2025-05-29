package src.q29699;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 05. 09.
 * @Description : 백준 29699
 * @Link : https://www.acmicpc.net/problem/29699
 */
public class Main {
    static final String str = "WelcomeToSMUPC";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N번째 수 입력
        sc.close();

        int remain = (n - 1) % 14; // 나머지 계산
        System.out.println(str.charAt(remain)); // 나머지에 해당하는 문자 출력
    }
}
