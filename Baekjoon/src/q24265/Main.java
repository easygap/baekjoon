package q24265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long test = Integer.parseInt(br.readLine());
		
		long total = 0;
		
		for(long i = test - 1; i > 0; i--) {
			total = total + i;
		}
		System.out.println(total);
		System.out.print(2);
	}
}