package src.q10569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 07. 18.
 * @Description : 백준 10569
 * @Link : https://www.acmicpc.net/problem/10569
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int cases = Integer.parseInt(br.readLine());    // 테스트 케이스 수

            for (int i = 0; i < cases; i++) {
                String input[] = br.readLine().split(" ");
                int v = Integer.parseInt(input[0]);    // 꼭지점 개수
                int e = Integer.parseInt(input[1]);    // 모서리 개수
                int f = e - v + 2;    // 면 개수
                System.out.println(f);
            }
            br.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
