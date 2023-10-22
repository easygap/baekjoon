package q30008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		
		for(int i = 0; i < K; i++) {
			int score = sc.nextInt();
			int avg = (score*100)/N;
			if(0 <= avg && avg <= 4)
				System.out.print("1 ");
			if(4 < avg && avg <= 11)
				System.out.print("2 ");
			if(11 < avg && avg <= 23)
				System.out.print("3 ");
			if(23 < avg && avg <= 40)
				System.out.print("4 ");
			if(40 < avg && avg <= 60)
				System.out.print("5 ");
			if(60 < avg && avg <= 77)
				System.out.print("6 ");
			if(77 < avg && avg <= 89)
				System.out.print("7 ");
			if(89 < avg && avg <= 96)
				System.out.print("8 ");
			if(96 < avg && avg <= 100)
				System.out.print("9 ");
		}
		sc.close();
	}
}