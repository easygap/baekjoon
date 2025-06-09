package src.q9461;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 06. 09.
 * @Description : 백준 9461
 * @Link : https://www.acmicpc.net/problem/9461
 */
public class Main {
    public static void main(String[] args) {
        long[] dp = new long[101]; // dp 배열 초기화
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for(int i = 4; i<= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3]; // 점화식
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int t = Integer.parseInt(br.readLine()); // 테스트 케이스
            StringBuilder sb = new StringBuilder(); // 결과 저장
            for(int i = 0; i < t; i++) {
                int p = Integer.parseInt(br.readLine());
                sb.append(dp[p]).append("\n"); // 각 테스트 케이스에 대한 결과
            }
            br.close(); // BufferedReader 닫기
            System.out.print(sb); // 결과 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
