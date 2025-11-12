package q10174;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 11. 11.
 * @Description : 백준 10174
 * @Link : https://www.acmicpc.net/problem/10174
 */
public class Main {
    public static String isPalindrome(String str) {
        str = str.toLowerCase();    // 대소문자 구분 X

        int left = 0;    // 좌측 포인터
        int right = str.length() - 1;    // 우측 포인터

        while (left < right) {    // 투 포인터
            if (str.charAt(left) != str.charAt(right))
                return "No";
            right--;    // 오른쪽 포인터 이동
            left++;    // 왼쪽 포인터 이동
        }
        return "Yes";
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int n = Integer.parseInt(br.readLine());    // 테스트 케이스

            for (int i = 0; i < n; i++) {
                String palindromeStr =  br.readLine();
                sb.append(isPalindrome(palindromeStr)).append("\n");
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}