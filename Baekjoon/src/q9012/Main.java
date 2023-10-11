package q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(bf.readLine());
		
		for ( int i = 0; i < num; i++ ){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			
			if(s.equals("(")) {
				sb.append(stack.add(1));
			}
			else if(s.equals(")")) {
				if(!s.isEmpty()) {
					sb.append(stack.set(1, 0));
				}
				else
					sb.append(stack.pop());
			}
						
			if(stack.search(0) != -1){
				System.out.println("No");
			}
			else {
				System.out.println("YES");
			}
		}
	}
}