package q25304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			int won = sc.nextInt();
			int ea = sc.nextInt();
			sum = sum + won * ea;
		}
		sc.close();
		
		if(sum == total) 
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}