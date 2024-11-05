package src.q31403;

import java.util.Scanner;

/*
 * @Author : ljs
 * @Date : 2024. 11. 05.
 * @Description : 백준 31403 A + B - C
 * @Link : https://www.acmicpc.net/problem/31403
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a 입력
        int b = sc.nextInt(); // b 입력
        int c = sc.nextInt(); // c 입력
        sc.close();
        int result = a + b - c; // 결과
        Calculator cal = new Calculator(); // 계산기 클래스 생성

        System.out.println(cal.calNum(a, b, c)); // 숫자 연산 결과 출력
        System.out.println(cal.calAlp(a, b, c)); // 문자열 연산 결과 출력
    }
}

class Calculator {
    // 숫자 연산
    public int calNum(int a, int b, int c) {
        return a + b - c;
    }

    // 문자열 연산
    public int calAlp(int a, int b, int c) {
        return Integer.parseInt(String.valueOf(a) + String.valueOf(b)) - c;
    }
}