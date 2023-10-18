package q10813;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[101];


		for (int j = 0; j < N; j++) {
			arr[j] = j + 1;
		}

		for (int i = 0; i < M; i++) {
			int fir = sc.nextInt();
			int sec = sc.nextInt();

			int front = arr[fir - 1];
			arr[fir - 1] = arr[sec - 1];
			arr[sec - 1] = front;
		}
		
		sc.close();
		
		for (int i = 0; i < N; i++)
			if(i < N - 1)
				System.out.printf("%d ", arr[i]);
			else
				System.out.printf("%d", arr[i]);
	}
}