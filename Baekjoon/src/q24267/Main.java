package q24267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long num = Integer.parseInt(br.readLine());

		System.out.printf("%d\n%d", num*(num-1)*(num-2)/6, 3);
	}
}