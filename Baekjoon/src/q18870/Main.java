package q18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer prt = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(st.nextToken());

		int[] result = new int[num];
		
		int n = 0;
		int count = 0;

		while (prt.hasMoreTokens()) {
			result[n++] = Integer.parseInt(prt.nextToken());
		}
		
		int[] re = result.clone();
		Arrays.sort(result);
		
		count = 0;

		for (int i = 0; i < result.length; i++) {
			if(!hashMap.containsKey(result[i])) {
				hashMap.put(result[i], count++);
			}
		}
		for (int i = 0; i < result.length; i++) {
			sb.append(hashMap.get(re[i])).append(" ");
		}
		System.out.println(sb.toString());
	}
}