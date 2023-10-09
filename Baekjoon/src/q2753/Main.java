package q2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		if(num % 4 == 0 && num % 100 != 0) {
			System.out.print("1");
		} else if (num % 400 == 0) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
	}
}