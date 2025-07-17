package src.q2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 17.
 * * @Description : 백준 2609 최대공약수와 최소공배수
 * * @Link : https://www.acmicpc.net/problem/2609
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");    // 입력
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            br.close();    // BufferedReader 닫기

            int gcd = gcd(a, b); // 최대공약수 계산
            System.out.println(gcd); // 최대공약수 출력
            System.out.println(a * b / gcd);    // 최소공배수 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 최대공약수 계산 함수
    private static int gcd(int a, int b) {
        if(b == 0)    // 탈출 조건
            return a;
        return gcd(b, a % b);    // 유클리드 호제법
    }
}
