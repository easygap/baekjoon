package src.q25707;

import java.util.Scanner;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 08.
 * * @Description : 백준 25707
 * * @Link : https://www.acmicpc.net/problem/25707
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력 받을 수
        sc.close(); // Scanner 객체 종료

        int[] beads = new int[n]; // 구슬 배열

        for(int i = 0; i < n; i++) {
            beads[i] = sc.nextInt(); // 구슬 개수
        }
        
    }
}
