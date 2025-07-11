package src.q32458;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 07. 08.
 * @Description : 백준 32458
 * @Link : https://www.acmicpc.net/problem/32458
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(); // 입력 받을 수
        sc.close(); // Scanner 객체 종료

        System.out.println((int)n); // 강제 형변환 double -> int
    }
}
