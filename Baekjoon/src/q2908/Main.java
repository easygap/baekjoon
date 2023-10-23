package q2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder(str);
		
		String reverse = sb.reverse().toString();
		
		StringTokenizer st = new StringTokenizer(reverse);
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(A > B)
			System.out.printf("%d", A);
		else
			System.out.printf("%d", B);
	}
}