package src.q23813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 11.
 * * * @Description : 백준 23813
 * * * @Link : https://www.acmicpc.net/problem/23813
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String startNum = br.readLine();    // 입력 받을 수
            String currentNum = startNum;

            br.close();    // BufferedReader 객체 종료

            long result = 0;    // 합계 초기화
            do {
                result += Long.parseLong(currentNum);    // 현재 수를 합에 더함

                char lastChar = currentNum.charAt(currentNum.length() - 1);    // 현재 수의 마지막 문자
                String remainNum = currentNum.substring(0, currentNum.length() - 1);    // 마지막 문자를 제외한 부분

                currentNum = lastChar + remainNum;    // 문자 회전
            } while (!currentNum.equals(startNum));    // 현재 수와 시작 수가 같을 때까지 반복

            System.out.println(result);    // 결과 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
