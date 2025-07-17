package src.q34052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 17.
 * * @Description : 백준 34052
 * * @Link : https://www.acmicpc.net/problem/34052
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;    // 합계 초기화
        try {
            for(int i = 0; i < 4; i++) {
                int num = Integer.parseInt(br.readLine());    // 입력
                sum += num;    // 걸린 시간 합
            }
            br.close();    // BufferedReader 닫기
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(sum <= 1500)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}