package q10872;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		int result = 1;
		
		for(int i = num; i >= 1; i--) {
			result = result * i;
		}
		System.out.println(result);
	}
}
