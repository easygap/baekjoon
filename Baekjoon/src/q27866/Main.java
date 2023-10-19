package q27866;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String abc = sc.next();
		char[] word = abc.toCharArray();
		
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.print(word[num-1]);
	}
}