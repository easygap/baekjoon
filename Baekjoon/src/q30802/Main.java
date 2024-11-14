package src.q30802;

import java.util.Scanner;

/*
 * @Author : ljs
 * @Date : 2024. 11. 14.
 * @Description : 백준 30802 웰컴 키트
 * @Link : https://www.acmicpc.net/problem/30802
 */
public class Main {

    // 티셔츠를 나눠줄 수 있는 최소 묶음 수를 반환하는 함수
    public static int divideShirts(int[] shirts, int T){
        int sum = 0;

        for (int shirt : shirts) {
            if(shirt % T == 0)
                sum += shirt / T; // 나누어 떨어지면 그대로 더함
            else
                sum += shirt / T + 1; // 나누어 떨어지지 않으면 1을 더함
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] shirts = new int[6]; // 사이즈 별 티셔츠 배열 [S, M, L, XL, XXL, XXXL]
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성
        int N = sc.nextInt(); // 참가자의 수

        // 티셔츠의 사이즈 별로 갯수 입력
        for(int i = 0; i < shirts.length; i++){
            shirts[i] = sc.nextInt();
        }
        int T = sc.nextInt(); // 티셔츠의 묶음 수
        int P = sc.nextInt(); // 펜의 묶음 수
        sc.close(); // Scanner 객체 닫기

        System.out.println(divideShirts(shirts, T)); // 티셔츠 최소 묶음 출력
        System.out.println(N/P + " " + N%P); // 펜의 최대 묶음과 나머지 출력
    }
}
