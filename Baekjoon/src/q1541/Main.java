package src.q1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 17.
 * * @Description : 백준 1541 잃어버린 괄호
 * * @Link : https://www.acmicpc.net/problem/1541
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String expression = br.readLine();    // 연산식 입력;
            String[] parts = expression.split("-");    // '-' 기준으로 분리

            int result = 0;    // 결과 초기화

            // 첫번째 부분
            String[] firstParts = parts[0].split("\\+");    // '+' 기준으로 분리
            for(String num : firstParts)
                result += Integer.parseInt(num);    // '+'연산 수행

            // 나머지 부분
            for (int i = 1; i < parts.length; i++) {
                String[] otherParts = parts[i].split("\\+");    // '+' 기준으로 분리
                int sum = 0;    // 부분 합 초기화
                for(String num : otherParts)
                    sum += Integer.parseInt(num);    // '+'연산 수행

                result -= sum;    // 뺄셈 연산
            }
            System.out.println(result);    // 결과 출력

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}