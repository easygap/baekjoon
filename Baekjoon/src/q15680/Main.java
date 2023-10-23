package q15680;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		sc.close();
		
		if(test == 0) {
			System.out.print("YONSEI");
		} else if (test == 1) {
			System.out.print("Leading the Way to the Future");
		}
	}
}