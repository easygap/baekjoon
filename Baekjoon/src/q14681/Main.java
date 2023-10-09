package q14681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 > 0 && num2 > 0) {
			System.out.print("1");
		} else if(num1 < 0 && num2 > 0) {
			System.out.print("2");
		} else if(num1 < 0 && num2 < 0) {
			System.out.print("3");
		}else if(num1 > 0 && num2 < 0) {
			System.out.print("4");
		}else {
			System.out.print("사분면 위에 있습니다.");
		}
	}
}