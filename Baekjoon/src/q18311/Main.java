package src.q18311;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 07. 24.
 * @Description : 백준 18311
 * @Link : https://www.acmicpc.net/problem/18311
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = br.readLine().split(" ");    // 입력
            int n = Integer.parseInt(input[0]);    // 코스 수
            long k = Long.parseLong(input[1]);    // 이동 거리

            String[] course = br.readLine().split(" ");    // 코스 정보
            int[] courses = new int[n];    // 코스 정보를 저장할 배열
            for (int i = 0; i < n; i++) {
                courses[i] = Integer.parseInt(course[i]);    // 문자열을 정수로 변환
            }

            boolean turn = true;    // 반환점 통과 여부
            for (int i = 0; i < courses.length; i++) {
                k -= courses[i];    // 이동 거리에서 코스 길이 차감
                if (k < 0) {
                    System.out.println(i + 1);    // 반환점 통과 시 인덱스 출력
                    turn = false;    // 반환점 통과 상태 변경
                    break;    // 반복문 종료
                }
            }

            if (turn) {
                for (int i = courses.length - 1; i >= 0; i--) {
                    k -= courses[i];    // 이동 거리에서 코스 길이 차감
                    if (k < 0) {
                        System.out.println(i + 1);    // 반환점 통과 시 인덱스 출력
                        break;    // 반복문 종료
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
