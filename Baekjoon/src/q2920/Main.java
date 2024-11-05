package src.q2920;

import java.util.Scanner;

/*
 * @Author : ljs
 * @Date : 2024. 11. 05.
 * @Description : 백준 2920 음계
 * @Link : https://www.acmicpc.net/problem/2920
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8]; // 8개의 음계 배열
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 음계 입력
        }
        sc.close();

        Music music = new Music(); // 음악 클래스 생성
        if(music.isAscending(arr)) {
            System.out.println("ascending"); // 오름차순
        } else if(music.isDescending(arr)){
            System.out.println("descending"); // 내림차순
        } else {
            System.out.println("mixed"); // 혼합
        }
    }
}

/*
 * @Description: 음악 클래스
 */
class Music {
    // 오름차순인지 확인하는 함수
    boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 1부터 8까지 순차적으로 배열이 되어있는지 확인
            if (arr[i] != i + 1) {
                return false;
            }
        }
        return true;
    }

    // 내림차순인지 확인하는 함수
    boolean isDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 8부터 1까지 순차적으로 배열이 되어있는지 확인
            if (arr[i] != arr.length - i) {
                return false;
            }
        }
        return true;
    }
}