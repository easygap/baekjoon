package src.q5032;

import java.util.Scanner;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 08.
 * * @Description : 백준 5032
 * * * @Link : https://www.acmicpc.net/problem/5032
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt(); // 가지고 있는 빈 병
        int f = sc.nextInt(); // 발견한 빈 병
        int c = sc.nextInt(); // 바꾸는데 필요한 빈 병의 개수
        sc.close(); // Scanner 객체 종료

        int totalEmpty = e + f; // 총 빈 병 수
        int totalBottle = 0; // 마신 음료 수

        // 교환 가능하면 계속 반복
        while (totalEmpty >= c) {
            int newBottle = totalEmpty / c; // 마시고 나온 빈 병
            totalBottle += newBottle; // 마신 음료 + 1
            totalEmpty = totalEmpty % c + newBottle; // 남은 빈 병 + 마시고 나온 병
        }

        System.out.println(totalBottle); // 결과 출력
    }
}