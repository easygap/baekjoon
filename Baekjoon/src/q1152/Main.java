package q1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		sc.close();
		
		String[] word = s.split(" ");
		
		if(s.isBlank()) {
			System.out.print("0");
		} else if(word[0] == ""){
			System.out.printf("%d", word.length - 1);
		} else {
			System.out.printf("%d", word.length);
		}
	}
}