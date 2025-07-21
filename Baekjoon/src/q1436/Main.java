package src.q1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 07. 18.
 * @Description : 백준 1436
 * @Link : https://www.acmicpc.net/problem/1436
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());    // n번째 영화
            int count = 0;    // 666이 포함된 영화의 개수
            int num = 666;    // 첫 번째 영화 제목

            while (count != n) {    // n번째 영화 찾기
                if (String.valueOf(num).contains("666")) {
                    count++;
                }
                num++;
            }

            System.out.println(num - 1);    // 마지막 증가 n을 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
