package src.q24416;

import java.util.Scanner;

public class Main {
    static int count1 =0;
    static int count2 =0;
    static int count3 =0;
    static int[] f;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        f = new int[num];

        fib(num);
        fibonacci(num);

        System.out.print(count1 + " " + count2);
    }
    static int fib(int n){
        if(n == 1 || n == 2){
            count1++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    static int fibonacci(int n) {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            count2++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n - 1];
    }
}