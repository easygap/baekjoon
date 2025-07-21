package src.q28702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 07. 18.
 * @Description : 백준 28702
 * @Link : https://www.acmicpc.net/problem/28702
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String firstPart = br.readLine();
            String secondPart = br.readLine();
            String thirdPart = br.readLine();
            br.close();

            int num;    // 출력값
            if (isInteger(firstPart))
                num = Integer.parseInt(firstPart) + 3;    // 첫 번째 부분이 정수인 경우
            else if (isInteger(secondPart))
                num = Integer.parseInt(secondPart) + 2;    // 두 번째 부분이 정수인 경우
            else
                num = Integer.parseInt(thirdPart) + 1;    // 세 번째 부분이 정수인 경우

            System.out.println(fizzBuzz(num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true; // 문자열이 정수로 변환 가능하면 true 반환
        } catch (NumberFormatException e) {
            return false; // 변환 불가능하면 false 반환
        }
    }

    public static String fizzBuzz(int num) {
        if (num % 15 == 0)
            return "FizzBuzz";
        else if (num % 3 == 0)
            return "Fizz";
        else if (num % 5 == 0)
            return "Buzz";
        else
            return String.valueOf(num);
    }
}