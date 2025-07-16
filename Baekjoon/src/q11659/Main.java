package src.q11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 14.
 * * @Description : 백준 11659
 * * @Link : https://www.acmicpc.net/problem/11659
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());    // 첫번째 줄


            int n = Integer.parseInt(st.nextToken());    // 수의 개수
            int m = Integer.parseInt(st.nextToken());    // 합을 구하는 횟수
            int[] arr = new int[n + 1];    // 누적합 배열

            st = new StringTokenizer(br.readLine());    // 두번째 줄
            for(int i = 1; i <= n; i++) {
                arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());    // 누적합
            }
            StringBuilder sb = new StringBuilder();    // 결과 저장용

            for(int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());    // 합 구간 입력
                int start = Integer.parseInt(st.nextToken());    // 시작
                int end = Integer.parseInt(st.nextToken());    // 끝
                sb.append(arr[end] - arr[start - 1]).append("\n");    // 누적합 차이
            }
            System.out.print(sb);    // 결과 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
