package src.q4101;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 05. 09.
 * @Description : 백준 4101
 * @Link : https://www.acmicpc.net/problem/4101
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0)
                break;
            if(a > b)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
