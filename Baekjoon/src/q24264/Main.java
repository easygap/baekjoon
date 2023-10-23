package q24264;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextInt();
		sc.close();
		
		int xy = 2;
		
		System.out.printf("%d\n%d", num * num, xy);
	}
}