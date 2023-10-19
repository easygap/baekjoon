package q11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sum = 0;
		
		String num = sc.next();
		sc.close();
		
		char[] result = num.toCharArray();
		
		for(int i = 0; i < N; i++) {
			sum = sum + Character.getNumericValue(result[i]);
		}
		System.out.printf("%d", sum);
	}
}