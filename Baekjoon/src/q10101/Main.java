package q10101;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ang1 = sc.nextInt();
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt();
		sc.close();
		
		int total = ang1 + ang2 + ang3;
		
		if(total == 180) {
			if(ang1 != ang2 && ang2 != ang3 && ang1 != ang3)
				System.out.print("Scalene");
			else if(ang1 == ang2 && ang2 == ang3 && ang1 == ang3)
				System.out.print("Equilateral");
			else
				System.out.print("Isosceles");
		} else 
			System.out.print("Error");
		
	}
}