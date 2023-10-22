package q26068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 0; i < test; i++) {
			String str = br.readLine();
			int day = Integer.parseInt(str.substring(2));

			if(day <= 90)
				count++;
			
		}
		System.out.println(count);
	}
}