package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int room = 1;
		int m = 1;
		
		sc.close();
		
		while(true) {
			if (num <= room) {
				break;
			}
			room = room + 6 * m++;
		}
		System.out.println(m);
	}
}