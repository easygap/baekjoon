package q2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[9];
		
		int max = -101;
		
		int count = 1;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < num.length; i++) {
			max = Math.max(num[i], max);
		}
		
		
		for(int i = 0; i < 9; i++) {
			if(num[i] == max) {
				break;
			}
			if(num[i] < max) {
				count++;
			}
		}
		
		System.out.println(max);
		System.out.print(count);
	}
}