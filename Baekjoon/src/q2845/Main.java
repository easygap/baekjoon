package q2845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		String test = br.readLine();
		StringTokenizer t = new StringTokenizer(test);
		
		int people = L * P;
		
		int[] total = new int[5];
		
		for(int i = 0; i < total.length; i++) {
			total[i] = Integer.parseInt(t.nextToken());
			
			System.out.printf("%d ", total[i] - people);
		}
	}
}