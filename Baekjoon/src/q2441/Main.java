package src.q2441;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수 N 입력

        sc.close();
        for (int i = 0; i < n; i++){
            for(int k = 0; k < i; k++) {
                System.out.print(" "); // 공백 출력
            }
            for(int j = 0; j < n - i; j++) {
                System.out.print("*"); // 별 출력
            }
            System.out.println();
        }
    }
}
