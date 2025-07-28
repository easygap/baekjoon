package src.q1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @Author : ljs
 * @Date : 2025. 07. 24.
 * @Description : 백준 1676
 * @Link : https://www.acmicpc.net/problem/1676
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            String facNum = factorial(BigInteger.valueOf(n)).toString();     // 팩토리얼 계산

            int cnt = 0;    // 끝에 오는 0의 개수

            for (int i = facNum.length() - 1; i >= 0; i--) {
                if (facNum.charAt(i) == '0') {
                    cnt++;    // 0이 나오면 개수 증가
                } else {
                    break;    // 0이 아닌 숫자가 나오면 반복문 종료
                }
            }
            System.out.println(cnt);    // 끝에 오는 0의 개수 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* 팩토리얼 계산 함수 */
    public static BigInteger factorial(BigInteger n) {
        BigInteger facNum = BigInteger.valueOf(1);
        for(int i = 2; i <= n.intValue(); i++) {
            facNum = facNum.multiply(BigInteger.valueOf(i));
        }
        return facNum;
    }
}
