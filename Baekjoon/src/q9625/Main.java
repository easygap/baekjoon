package q9625;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 08. 14.
 * @Description : 백준 9625
 * @Link : https://www.acmicpc.net/problem/9625
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        // DP 배열
        int[] dpA = new int[46];
        int[] dpB = new int[46];

        // K = 0일 때
        dpA[0] = 1;
        dpB[0] = 0;

        // K = 1 일 때
        dpA[1] = 0;
        dpB[1] = 1;

        // 점화식
        for (int i = 2; i <= K; i++) {
            dpA[i] = dpA[i - 2] + dpA[i - 1];
            dpB[i] = dpB[i - 2] + dpB[i - 1];
        }

        System.out.println(dpA[K] + " " + dpB[K]);    // 결과 출력
    }
}