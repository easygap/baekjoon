package q2083;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			if(str.equals("# 0 0")) {
				sc.close();
				break;
			}
			StringTokenizer st = new StringTokenizer(str);
			
			String name = st.nextToken();
			String age = st.nextToken();
			String weight = st.nextToken();
			
			System.out.print(name + " ");
			
			if(Integer.parseInt(age) > 17 || Integer.parseInt(weight) >= 80) 
				System.out.print("Senior\n");
			else
				System.out.print("Junior\n");
		}
	}
}