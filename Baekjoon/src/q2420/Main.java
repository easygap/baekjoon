package q2420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		BigInteger N = new BigInteger(st.nextToken());
		BigInteger M = new BigInteger(st.nextToken());
		
		System.out.printf("%d", N.subtract(M).abs());
	}
}