package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int test = sc.nextInt();
		String ox = new String();
		
		for(int i = 0; i < test; i++) {
			ox = sc.next();
			
			int count = 1;
			int sum = 0;
			
			for(int j = 0; j < ox.length(); j++) {
				if(ox.charAt(j) == 'O') {
					sum += count++;
				} else {	// 'X'
					count = 1;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}