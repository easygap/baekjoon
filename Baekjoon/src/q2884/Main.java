package q2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		if( m < 45 && h != 0) {
			h = h - 1;
			m = m + 15;
		} else if ( m < 45 && h == 0) {
			h = 23;
			m = m + 15;
		} else if ( m >= 45 && h == 0) {
			m = m - 45;
		} else if(( m >= 45 && h != 0)){
			m = m - 45;
		}
		
		System.out.print(h + " " + m);
	}
}	