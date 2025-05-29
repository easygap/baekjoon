package src.q1094;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 05. 29.
 * @Description : 백준 1094
 * @Link : https://www.acmicpc.net/problem/1094
 */
public class Main {
    public static void main(String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(br.readLine()); // 입력받은 정수
            br.close(); // BufferedReader 종료

            int count = 0; // 막대기 개수
            int length = 64; // 처음 막대기 길이

            while (x > 0) {
                if (x >= length) {
                    x -= length; // 현재 막대기 길이를 뺌
                    count++; // 막대기 개수 증가
                }
                length /= 2; // 막대기 길이를 절반으로 감소
            }

            System.out.println(count); // 결과 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
