package q1913;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sqr = sc.nextInt();
		//int cor = sc.nextInt();
		
		int count = sqr * sqr;
		
		for(int i = 0; i < sqr; i++) {
			System.out.printf("%d ", count);
			count--;
			for(int j = 0; j < sqr; j++) {
				if(j == sqr) {
					System.out.println();
				}
				System.out.printf("%d ", count);
				count--;
			}
		}
		sc.close();
	}
}