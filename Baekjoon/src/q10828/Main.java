package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());	// 반복 횟수
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			
			if(S.equals("push"))					// push 구현
				stack.push(Integer.parseInt(st.nextToken()));
			
			else if(S.equals("pop")) {				// pop 구현
				if(!stack.empty())
					sb.append(stack.pop()).append("\n");
				else
					sb.append(-1).append("\n");
			}
			
			else if(S.equals("size"))				// size 구현			
				sb.append(stack.size()).append("\n");
			
			
			else if(S.equals("empty")) {			// empty 구현	
				if(!stack.empty())
					sb.append(0).append("\n");
				else
					sb.append(1).append("\n");
			}
			
			else {									// top 구현
				if(!stack.empty())					
					sb.append(stack.peek()).append("\n");
				else
					sb.append(-1).append("\n");
			}
		} 
		
		System.out.println(sb);
		
	}
}