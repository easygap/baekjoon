package q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		if(num >= 90 && num<=100) {
			System.out.print("A");
		} else if(num >= 80 && num<90) {
			System.out.print("B");
		} else if(num >= 70 && num<80) {
			System.out.print("C");
		} else if(num >= 60 && num<70) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
			
	}
}