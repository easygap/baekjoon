package q1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 08. 01.
 * @Description : 백준 1012
 * @Link : https://www.acmicpc.net/problem/1012
 */
public class Main {
    private static int m, n;    // 배추밭 가로길이(m), 세로길이(n)
    private static boolean[][] block;    // 배추밭

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());

            for(int i = 0; i < t; i++){
                String[] input = br.readLine().split(" ");
                m = Integer.parseInt(input[0]);
                n = Integer.parseInt(input[1]);
                int cabbageCnt = Integer.parseInt(input[2]);    // 배추 위치 개수
                block = new boolean[m][n];

                for(int j = 0; j < cabbageCnt; j++){
                    String[] cabbagePos = br.readLine().split(" ");
                    int x = Integer.parseInt(cabbagePos[0]);
                    int y = Integer.parseInt(cabbagePos[1]);
                    block[x][y] = true;
                }

                int count = 0;    // 배추흰지렁이 마리 수
                for(int j = 0; j < m; j++){
                    for(int k = 0; k < n; k++){
                        if(block[j][k]) {
                            count++;
                            dfs(j, k);
                        }
                    }
                }
                System.out.println(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dfs(int j, int k) {
        block[j][k] = false;    // 탐색 완료 표시

        // 이어진 부분을 모두 탐색
        if(j - 1 >= 0 && block[j - 1][k]) dfs(j-1, k);
        if(j + 1 < m && block[j + 1][k]) dfs(j+1, k);
        if(k - 1 >= 0 && block[j][k - 1]) dfs(j, k - 1);
        if(k + 1 < n && block[j][k + 1]) dfs(j, k + 1);
    }
}
