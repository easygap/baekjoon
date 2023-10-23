package q18409;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		String str = sc.next();
		
		char[] word = new char[test];
		
		int count = 0;
		
		for(int i = 0; i < word.length; i++) {
			word[i] = str.charAt(i);
			if(word[i] == 'a' || word[i] == 'i' || word[i] == 'u' || word[i] == 'e' || word[i] == 'o') {
				count++;
			}
		}
		sc.close();
		System.out.printf("%d", count);
	}
}