package q20492;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		System.out.printf("%.0f %.0f", (double) num * 0.78, num - (double) num * 0.2 * 0.22);
	}
}