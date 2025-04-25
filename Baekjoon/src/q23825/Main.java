package src.q23825;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 04. 24.
 * @Description : 백준 23825
 * @Link : https://www.acmicpc.net/problem/23825
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 블록 N
        int m = sc.nextInt(); // 블록 M
        int sasa = 0; // 만들 모형 개수
        while ((n > 1 && m > 1)) { // 각 블록이 2개 이상 남아있을 때
            n -= 2; // 블록 N에서 2개 사용
            m -= 2; // 블록 M에서 2개 사용
            sasa++; // 모형 개수 증가
        }
        System.out.println(sasa); // 결과 출력
    }
}
