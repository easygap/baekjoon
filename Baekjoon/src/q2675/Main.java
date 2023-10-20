package q2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cycle = sc.nextInt();
		
		for(int i = 0; i < cycle; i++) {
			int num = sc.nextInt();
			
			String s = sc.next();
			char[] word = s.toCharArray();
			
			for(int j = 0; j < word.length; j++) {
				for(int k = 0; k < num; k++) {
					System.out.printf("%c", word[j]);
				}
			}	
			System.out.println();
		}
		sc.close();
	}
}