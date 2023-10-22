package q10953;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int j = 0; j < test; j++) {
			String str = sc.next();

			String[] num = str.split(",");
			int total = 0;

			for (int i = 0; i < num.length; i++) {
				total = total + Integer.parseInt(num[i]);
			}
			System.out.println(total);
		}
		sc.close();
	}
}