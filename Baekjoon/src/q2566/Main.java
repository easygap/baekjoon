package src.q2566;

import java.util.Scanner;
import static java.lang.Integer.MIN_VALUE;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 9;
        int col = 9;
        int[][] arr = new int[row][col];
        int max = MIN_VALUE;
        int x = 0;
        int y = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
        scanner.close();
    }
}