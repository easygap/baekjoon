package q2743;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		sc.close();
		
		char[] arr = word.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			count++;
		}
		System.out.print(count);
	}
}