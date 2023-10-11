package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> queue = new LinkedList<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		int back = 0;
	
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			
			if(s.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				queue.offer(num);
				back = num;
			}
			
			else if(s.equals("pop")) {
				if(! queue.isEmpty()) 
					sb.append(queue.poll()).append("\n");
				else 
					sb.append(-1).append("\n");	
			}
			
			else if(s.equals("size")) 
				sb.append(queue.size()).append("\n");
			
			else if(s.equals("empty")) {
				if(! queue.isEmpty()) 
					sb.append(0).append("\n");
				else 
					sb.append(1).append("\n");
			}
			
			else if(s.equals("front")) {
				if(! queue.isEmpty())
					sb.append(queue.peek()).append("\n");
				else
					sb.append(-1).append("\n");
			}
			
			else if(s.equals("back")){
				if(! queue.isEmpty())
					sb.append(back).append("\n");
				else
					sb.append(-1).append("\n");
			}
			else
				break;
		}
		System.out.println(sb);
	}
}