package q2475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int count = 0;
		
		int[] five = new int[str.length()];
		
		while(st.hasMoreTokens()) {
			five[count] = Integer.parseInt(st.nextToken()); 
			count++;
		}
		
		int sum = 0;
		
		for(int i = 0; i < five.length; i++) {
			five[i] = five[i] * five[i];
			sum = sum + five[i];
		}
		System.out.printf("%d", sum % 10);
	}
}