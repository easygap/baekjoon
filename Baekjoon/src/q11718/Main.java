package q11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<String> str = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"\n");
		
//		String word = st.nextToken();
//		String[] str = new String[100];
		
		while(st.hasMoreTokens()) {
			str.add(st.nextToken());
		}
//		String[] word = str.split("");
//
//		for(int i = 0; i < word.length; i++) {
//			System.out.println(word[i]);
//		}
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}
	}
}