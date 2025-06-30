package src.q11727;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 06. 10.
 * @Description : 백준 11727
 * @Link : https://www.acmicpc.net/problem/11727
 */
public class Main {
    public static void main(String[] args) {
        int dp[] = new int[1001]; // dp 배열
        
        dp[1] = 1;
        dp[2] = 3;
        
        for(int i = 3; i < 1001; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007; // 점화식
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int n = Integer.parseInt(br.readLine()); // 정수 N 입력
            br.close(); // BufferedReader 종료
            System.out.println(dp[n]); // 결과 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
