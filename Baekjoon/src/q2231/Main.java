package src.q2231;

import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 04. 25.
 * @Description : 백준 2231
 * @Link : https://www.acmicpc.net/problem/2231
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        int n = sc.nextInt(); // 자연수 N

        for(int i = 0; i< n; i++){
            int sum = i; // 분해합
            int temp = i; // 임시

            while(temp > 0) { // 모든 자리수를 확인할 때까지
                sum += temp % 10; // 각 자리수를 더함
                temp = temp / 10; // 자리수 이동
            }

            if(sum == n) { // 분해합이 N과 같으면
                System.out.println(i); // 해당하는 i를 출력
                return; // 종료
            }
        }
        System.out.println(0); // 생성자가 없는 경우에는 0을 출력
    }
}
