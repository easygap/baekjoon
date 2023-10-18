package q10811;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[101];
		int[] rpc = new int[101];
		
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
			rpc[i] = arr[i];
		}
		
		for(int i = 0; i < M; i++) {
			int fnt = sc.nextInt();
			int bck = sc.nextInt();
			
			for(int j = fnt; j <= bck; j++) {
				for(int k = bck; k >= fnt; k--) {
					arr[j-1] = rpc[k-1];
					arr[k-1] = rpc[j-1];
					rpc[j-1] = arr[j-1];
					rpc[k-1] = arr[k-1];
				}
			}
		}
		sc.close();
		
		for(int i = 0; i < N; i++) {
			if(i < N - 1) 
				System.out.printf("%d ", arr[i]);
			else
				System.out.printf("%d", arr[i]);			
		}
	}
}