package q14492;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 08. 04.
 * @Description : 백준 14492
 * @Link : https://www.acmicpc.net/problem/14492
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // N * N 행렬의 크기

        boolean[][] a = new boolean[n][n];
        boolean[][] b = new boolean[n][n];

        // a 행렬 초기화
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(input[j]) == 1;    // '1'일 때만 true로 저장
            }
        }

        // b 행렬 초기화
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                b[i][j] = Integer.parseInt(input[j]) == 1;    // '1'일 때만 true로 저장
            }
        }

        int count = 0;    // '1' 개수 카운트

        // 부울곱 연산 및 '1'의 개수 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                boolean resultElement = false; // C[i][j] 값 저장용 변수

                // (ai1∧b1j)∨(ai2∧b2j)∨...∨(ain∧bnj) 계산
                for (int k = 0; k < n; k++) {
                    if (a[i][k] && b[k][j]) {    // AND(∧) 연산 후 OR(∨) 연산 수행
                        resultElement = true;
                        break;    // OR 연산이므로 한 번이라도 true가 나오면 탈출
                    }
                }

                if (resultElement) {
                    count++;
                }
            }
        }

        System.out.println(count);    // 결과 출력
    }
}