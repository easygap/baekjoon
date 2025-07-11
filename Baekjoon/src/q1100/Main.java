package src.q1100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 05. 30.
 * @Description : 백준 1100
 * @Link : https://www.acmicpc.net/problem/1100
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = 0; // 흰 칸의 개수
            for (int i = 0; i < 8; i++) {
                String line = br.readLine(); // 체스판 한 줄
                for (int j = 0; j < 8; j++) {
                    if(line.charAt(j) == 'F' && (i + j) % 2 == 0) {
                        count++; // 흰 칸에 말이 있는 경우 개수 카운트
                    }
                }
            }
            System.out.println(count); // 결과 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
