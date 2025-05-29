package src.q10773;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author : ljs
 * @Date : 2025. 05. 12.
 * @Description : 백준 10773
 * @Link : https://www.acmicpc.net/problem/10773
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); // 반복 횟수
        int sum = 0; // 스택에 저장된 값의 합

        Stack<Integer> stack = new Stack<>(); // 스택 생성

        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            if(n == 0)
                stack.pop(); // 0이면 스택에서 제거
            else
                stack.push(n); // 0이 아니면 스택에 추가
        }
        sc.close();

        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i); // 스택에 저장된 값의 합 계산
        }
        System.out.println(sum); // 결과 출력
    }
}
