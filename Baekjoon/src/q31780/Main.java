package src.q31780;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 05. 30.
 * @Description : 백준 31780
 * @Link : https://www.acmicpc.net/problem/31780
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = br.readLine().split(" "); // 입력 문자열을 공백으로 분리
            int X = Integer.parseInt(input[0]); // 조상 포닉스의 마력
            int M = Integer.parseInt(input[1]); // 명령을 내린 횟수

            System.out.println(X * (M+1)); // 마력의 합
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
