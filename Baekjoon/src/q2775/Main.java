package src.q2775;

import java.util.Scanner;

/*
 * @Author : ljs
 * @Date2024. 11. 04.
 * @Description : 백준 2775 부녀회장이 될테야
 * @Link : https://www.acmicpc.net/problem/2775
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 테스트 케이스 개수
        int[][] arr = new int[15][15]; // [층][호수]
        for (int i = 0; i < num; i++) {
            int k = sc.nextInt(); // 층
            int n = sc.nextInt(); // 호수
            for (int j = 0; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    if (j == 0) {
                        arr[j][l] = l; // 0층 초기화
                    } else {
                        arr[j][l] = arr[j - 1][l] + arr[j][l - 1]; // 층, 호수에 따른 인원수 계산
                    }
                }
            }
            System.out.println(arr[k][n]); // 결과 출력
        }
        sc.close();
    }
}