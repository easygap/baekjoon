package src.q13458;

import java.util.Scanner;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 14.
 * * @Description : 백준 13458
 * * @Link : https://www.acmicpc.net/problem/13458
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    // 시험장 개수
        int[] a = new int[n];    // 각 시험장에 응시하는 학생

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();    // 시험장에 응시하는 학생
        }
        int b = sc.nextInt();    // 총감독관이 감독할 수 있는 학생
        int c = sc.nextInt();    // 부감독관이 감독할 수 있는 학생
        sc.close();    // Scanner 객체 종료

        long total = 0;    // 총 감독관 수

        for (int i = 0; i < n; i++) {
            a[i] -= b;    // 총감독관이 감독한 학생 수 제외
            total++;    // 총감독관 1명 추가
            if(a[i] > 0) {
                total += (a[i]) / c; // 부감독관이 감독할 수 있는 학생 만큼 카운트
                if (a[i] % c != 0) { // 나머지가 있으면 부감독관 1명 추가
                    total++;
                }
            }
        }
        System.out.println(total);    // 모든 감독관 수 출력
    }
}
