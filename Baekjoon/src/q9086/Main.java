package q9086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			String word = sc.next();
			char[] arr = word.toCharArray();
			System.out.println(arr[0] + "" + arr[word.length()-1]);
		}
		sc.close();
	}
}