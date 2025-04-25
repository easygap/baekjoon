package src.q2798;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 04. 25.
 * @Description : 백준 2798
 * @Link : https://www.acmicpc.net/problem/2798
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 카드 개수 N
        int m = sc.nextInt(); // 카드의 합 한계선

        int[] cards = new int[n]; // 카드 배열
        for(int i = 0; i < n; i++) {
            cards[i] = sc.nextInt(); // 카드 값 입력
        }
        sc.close(); // Scanner 종료

        int totalSum = 0; // 최대 합 초기화
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int preSum = cards[i] + cards[j] + cards[k]; // 카드 3장 합
                    if(preSum <= m && preSum > totalSum) { // 합이 한계선 이하이고 최대 합보다 크면
                        totalSum = preSum; // 최대 합 갱신
                    }
                }
            }
        }
        System.out.println(totalSum); // 결과 출력
    }
}
