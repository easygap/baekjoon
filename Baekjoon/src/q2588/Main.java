package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		int fir = num2 / 100 % 10;
		int sec = num2 / 10 % 10;
		int thr = num2 % 10;
	
		System.out.println(num1 * thr);
		System.out.println(num1 * sec);
		System.out.println(num1 * fir);
		
		System.out.println(num1 * num2);
	}
}