package src.q2587;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Author: ljs
 * @Date: 2024. 11. 05.
 * @Description: 백준 2587 대표값2
 * @Link: https://www.acmicpc.net/problem/2587
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // 5개의 정수 입력
        for (int i =  0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        arithmetic ar = new arithmetic(); // 산술 연산 클래스 생성
        System.out.println(ar.avg(arr)); // 평균 출력
        System.out.println(ar.medium(arr)); // 중앙값 출력
    }
}

/*
 * @Description: 산술 연산을 하는 클래스
 */
class arithmetic {
    // 평균 구하는 함수
    public int avg(int[] arr) {
        int sum = 0;

        // 배열의 합 구하기
        for (int j : arr) {
            sum += j;
        }

        return sum / arr.length; // 평균 반환
    }

    // 중앙값 구하는 함수
    public int medium(int[] arr) {
        Arrays.sort(arr); // 배열 정렬

        return arr[arr.length / 2]; // 중앙값 반환
    }
}
