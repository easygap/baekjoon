package q10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 5
		int M = sc.nextInt(); // 4

		int[] arr = new int[N];

		for (int a = 0; a < M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();

			for (int b = i - 1; b <= j - 1; b++) {
				arr[b] = k;
			}
		}

		for (int c = 0; c < arr.length; c++) {
			System.out.print(arr[c] + " ");
		}

		sc.close();
	}
}