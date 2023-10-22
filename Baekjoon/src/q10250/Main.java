package q10250;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int i = 0; i < test; i++) {

			int height = sc.nextInt();
			int width = sc.nextInt();
			int guest = sc.nextInt();

			int share = guest / height + 1;
			int remain = guest % height;

			if (remain != 0) {
				if (share < 10)
					System.out.printf("%d0%d\n", remain, share);
				else
					System.out.printf("%d%d\n", remain, share);
			} else {
				remain = height;
				share--;
				if (share < 10) 
					System.out.printf("%d0%d\n", remain, share);
				else 
					System.out.printf("%d%d\n", remain, share);
			}
		}
		sc.close();
	}
}