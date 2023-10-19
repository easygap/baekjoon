package q10811;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[101];
		int rpc;

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			int fnt = sc.nextInt() - 1;
			int bck = sc.nextInt() - 1;

			while(bck > fnt) {
				rpc = arr[fnt];
				arr[fnt] = arr[bck];
				arr[bck] = rpc;
				bck--;
				fnt++;
			}

		}
		sc.close();

		for (int i = 0; i < N; i++) {
			if (i < N - 1)
				System.out.printf("%d ", arr[i]);
			else
				System.out.printf("%d", arr[i]);
		}
	}
}