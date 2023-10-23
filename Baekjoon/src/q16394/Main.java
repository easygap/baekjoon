package q16394;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", year-1946);
	}
}