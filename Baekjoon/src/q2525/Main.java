package q2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int time = sc.nextInt();
		
		sc.close();
		
		if( m + time >= 60 && h < 24 ) {
			h = h + ((m + time) / 60);
			m = (m + time) % 60;
		} else if( m + time < 60 && h < 24) {
			m = m + time;
		} else if( m + time >= 60 && h >= 24) {
			h = 0 + (m + time /60);
		} else if ( m + time < 60 && h >= 24) {
			m = m + time;
		}
		
		while( h >= 24 ) {
			h = h - 24;
		}
	
		System.out.print(h + " " + m);
	}
}