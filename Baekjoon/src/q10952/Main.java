package q10952;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for ( ; ; ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if( a != 0 && b != 0 )
				System.out.printf("%d\n", a + b);
			else {
				sc.close();
				break;
			}
			
		}
	}
}