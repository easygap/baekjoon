package q2742;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();
		
		int j = N;
		
		for(int i = 0; i < N ; i++) {
			System.out.println(j);
			j--;
		}
	}
}