package q2444;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		for (int i = 0; i < 2 * num - 1; i++) {
			for (int j = 2 * num - 1; j > 0; j--) {
				if(j > i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}