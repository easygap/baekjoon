package q24267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long num = Integer.parseInt(br.readLine());

		long result = 0;
		
		for ( int i = 1; i < num - 2; i++ ) {

			for( int j = i + 1; j < num - 1; j++ ) {

				for( int k = j + 1; k < num; k++ ) {

					result= result + k;

				}
			}
		}

//		for (long i = num - 1; i > num - 4; i--) {
//			for (long j = i; j > i - 3; j--) {
//				result = result + j;
//			}
//		}
		System.out.printf("%d\n", result);
		System.out.printf("%d", 3);
	}
}