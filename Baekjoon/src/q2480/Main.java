package q2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num= new int[3];
		int tmp = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < num.length-1; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[j] > num[i]) {
					tmp = num[j];
					num[j] = num[i];
					num[i] = tmp;
				}
			}
		}
		
		if(num[0] != num[1] && num[1] != num[2]) {
			System.out.print(num[0]*100);
		} else if(num[0] == num[1] && num[1] != num[2]) {
			System.out.print(1000 + num[0] * 100);
		} else if(num[0] != num[1] && num[1] == num[2]){
			System.out.print(1000 + num[1] * 100);
		} else {
			System.out.print(10000 + num[0] * 1000);
		}
	}
}