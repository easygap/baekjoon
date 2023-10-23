package q5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char[] dial = new char[str.length()];
		
		int sum = 0;
		
		for(int i = 0; i < dial.length; i++) {
			if(str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C')
				dial[i] = 3;
			else if(str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F')
				dial[i] = 4;
			else if(str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I')
				dial[i] = 5;
			else if(str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L')
				dial[i] = 6;
			else if(str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O')
				dial[i] = 7;
			else if(str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S')
				dial[i] = 8;
			else if(str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V')
				dial[i] = 9;
			else if(str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z')
				dial[i] = 10;
			sum = sum + dial[i];
		}
		
		System.out.printf("%d", sum);
	}
}