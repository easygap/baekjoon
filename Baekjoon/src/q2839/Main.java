package src.q2839;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 04. 23.
 * @Description : 백준 2839 설탕 배달
 * @Link : https://www.acmicpc.net/problem/2839
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배달해야 할 설탕의 무게

        int count = 0; // 봉지의 개수 초기화
        while(N > 0) {
            if(N % 5 == 0) { // 5로 나누어 떨어지면
                count += N / 5; // 5kg 봉지 개수 카운트
                break; // 반복문 종료
            }
            N -= 3; // 3kg 봉지 하나를 사용
            count++; // 3kg 봉지 개수 카운트
        }

        if(N < 0) { // N이 음수이면
            System.out.println(-1); // 봉지를 만들 수 없음
        } else {
            System.out.println(count); // 봉지의 개수 출력
        }
        sc.close(); // Scanner 객체 닫기
    }
}
