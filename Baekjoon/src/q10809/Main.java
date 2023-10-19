package q10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] abc = new int[26];
		
		String wr = sc.next();
		sc.close();
		char[] word = wr.toCharArray();
		
		for(int i = 0; i < abc.length; i++) {
			abc[i] = -1;
		}
		
		for(int i = word.length - 1; i >= 0; i--) {
			abc[word[i]-97] = i;
		}
		
		for(int i = 0; i < abc.length; i++) {
			System.out.printf("%d ", abc[i]);
		}
	}
}