package src.q4153;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Author: ljs
 * @Date: 2024. 11. 05.
 * @Description: 백준 4153 직각삼각형
 * @Link: https://www.acmicpc.net/problem/4153
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 0 0 0 입력 전까지 무한 반복
        while (true) {
            int[] array = new int[3]; // 3개의 정수를 저장할 배열

            // 3개의 정수 입력
            for(int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }

            Arrays.sort(array); // 배열 오름차순 정렬

            // 0 0 0 입력 시 종료
            if(array[array.length - 1] == 0){
                break;
            }

            // 피타고라스 정리를 이용하여 직각삼각형인지 판별
            if(Math.pow(array[0], 2) + Math.pow(array[1], 2) == Math.pow(array[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}
