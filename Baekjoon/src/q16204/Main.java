package q16204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 08. 16.
 * @Description : 백준 16204
 * @Link : https://www.acmicpc.net/problem/16204
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        
        int matchO = Math.min(m, k);    // 'O'끼리 맞는 최대 개수
        int matchX = Math.min(n - m, n - k);    // 'X'끼리 맞는 최대 개수

        System.out.println(matchO + matchX);    // 결과 출력
    }
}