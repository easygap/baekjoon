package src.q2744;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 05. 09.
 * @Description : 백준 2744
 * @Link : https://www.acmicpc.net/problem/2744
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 문자열 입력

        sc.close();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // 문자 하나씩 가져오기

            if(Character.isUpperCase(ch))
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
        }
    }
}
