package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int max = sc.nextInt();
		
		int[] num = new int[a];
		
		for(int i = 0; i < a; i++) {
			num[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < a; i++) {
			if(num[i] < max) {
				System.out.print(num[i] + " ");
			}
		}
	}
}