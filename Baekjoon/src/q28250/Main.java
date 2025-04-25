package src.q28250;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 04. 25.
 * @Description : 백준 28250
 * @Link : https://www.acmicpc.net/problem/28250
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정수 N

        int number0 = 0; // 숫자 0일 때 개수
        int number1 = 0; // 숫자 1일 때 개수

        long mex1; // 1이 나오는 경우
        long mex2; // 2가 나오는 경우

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a == 0)
                number0++;
            else if(a == 1)
                number1++;
        }
        long combination = (long) number0 * (number0 - 1) / 2; // {0, 0} 조합의 개수
        long remain = (long) number0 * (n  - number0 - number1); // 0과 0 혹은 1이 아닌 조합의 개수

        mex1 = combination + remain;
        mex2 = (long) number0 * number1 * 2;
        System.out.println(mex1 + mex2); // 결과 출력
    }
}