package src.q11726;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 06. 09.
 * @Description : 백준 11726
 * @Link : https://www.acmicpc.net/problem/11726
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine()); // 입력 정수 N

            if(n == 1) {
                System.out.println(1); // N이 1일 때 결과는 1
                return;
            }

            int[] dp = new int[n + 1]; // DP 배열 초기화
            dp[1] = 1;
            dp[2] = 2;

            for(int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 10007; // 점화식
            }
            br.close(); // BufferedReader 종료
            System.out.println(dp[n]); // 결과 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
