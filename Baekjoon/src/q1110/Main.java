package q1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] num = new int[9][9];
		
		for(int i = 0; i < 2; i++) {
			String[] arr = sc.next().split("");
			for(int j = 0; j < 2; j++) {
				num[i][j] = Integer.parseInt(arr[i]);
			}
		}	
		sc.close();
	}
}