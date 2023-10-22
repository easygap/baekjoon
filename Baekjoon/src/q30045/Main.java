package q30045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int count = 0;

		for (int i = 0; i < num; i++) {
			String word = sc.next();

			if (word.contains("01") || word.contains("OI")) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}
}