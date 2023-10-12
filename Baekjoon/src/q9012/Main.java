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

		int num = Integer.parseInt(bf.readLine());

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			stack.clear();

			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);

				if (c == '(') {
					stack.add(1);
				}

				else if (c == ')') {
					if (!stack.isEmpty()) {
						stack.pop();
					} else {
						stack.add(0);
						break;
					}
				}
			}
			if (!stack.isEmpty() || stack.contains(0) != false) {
				System.out.println("No");
			} else {
				System.out.println("YES");
			}
		}
	}
}