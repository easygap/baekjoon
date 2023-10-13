package q10818;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int num[] = new int[a];
		int max = -9999999;
		int min = 9999999;
		
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < num.length; i++) {
			min = Math.min(num[i], min);
			max = Math.max(num[i], max);
					}
		System.out.print(min + " " + max);
	}
}