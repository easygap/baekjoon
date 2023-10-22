package q30007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int Num1 = sc.nextInt();
			int Num2 = sc.nextInt();
			int x = sc.nextInt();
			System.out.println(Num1 * (x - 1) + Num2);
		}
		sc.close();
	}
}