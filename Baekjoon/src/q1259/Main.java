package q1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		ArrayList<Character> chr = new ArrayList<Character>();
		String str = "1";

		while(true) {
			str = br.readLine();
			if (Integer.parseInt(str) == 0) {
				break;
			}
			
			for(int i = 0; i < str.length(); i++) {
				chr.add(str.charAt(i));
			}
			
			ArrayList<Character> reverse = (ArrayList<Character>)chr.clone();
			Collections.reverse(reverse);
			
			if(reverse.equals(chr)) 
				System.out.println("yes");
			else
				System.out.println("no");
			
			chr.clear();
		}
	}
}