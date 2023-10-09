package q10430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		System.out.printf("%d\n", (A+B)%C);
		System.out.printf("%d\n", ((A%C) + (B%C))%C);
		System.out.printf("%d\n", (A*B)%C);
		System.out.printf("%d", ((A%C) * (B%C))%C);
	}
}