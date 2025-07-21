package src.q2869;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 07. 18.
 * @Description : 백준 2869
 * @Link : https://www.acmicpc.net/problem/2869
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 낮에 올라가는 거리
        int b = sc.nextInt(); // 밤에 미끄러지는 거리
        int v = sc.nextInt(); // 나무의 높이
        sc.close();    // Scanner 닫기

        int day = (v - a) / (a - b) + 1;    // 정상까지 오르는 최소 날짜

        if((v - a) % (a - b) != 0) {
            day++;    // 나머지가 있으면 하루 더 필요
        }
        System.out.println(day);    // 결과 출력
    }
}