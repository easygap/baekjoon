package src.q24568;

import java.util.Scanner;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 15.
 * * @Description : 백준 24568
 * * @Link : https://www.acmicpc.net/problem/24568
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();    // 8개가 들어있는 박스
        int s = sc.nextInt();    // 3개가 들어있는 박스

        System.out.println((r * 8 + s * 3) - 28);     // 남은 개수 출력
    }
}
