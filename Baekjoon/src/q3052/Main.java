package q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int count = 0;
		
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			num = sc.nextInt();
			num = num % 42;
			arr[i] = num;
		}
		sc.close();
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = 1001;
					count++;
				}
			}
		}
		System.out.print(arr.length - count);
	}
}