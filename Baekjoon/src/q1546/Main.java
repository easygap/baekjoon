package q1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] avr = new double[N];
		
		double result = 0;
		
		double max = -1000;
		
		for(int i = 0; i < N; i++) {
			avr[i] = sc.nextDouble();
		}
		sc.close();
		
		for(int i = 0; i < N; i++) {
			if(avr[i] > max) {
				max = avr[i];
			}
		}
		
		for(int i = 0; i < N; i++) {
			avr[i] = avr[i] / max * 100;
			result = result + avr[i];
		}
		System.out.printf("%f", result/N);
	}
}