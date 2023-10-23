package q2530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int hou = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int sec = Integer.parseInt(st.nextToken());
		
		int time = Integer.parseInt(br.readLine());
		
		while(time != 0) {
			time--;
			sec++;
			if(sec == 60) {
				min++;
				sec = 0;
			}
			if(min == 60) {
				hou++;
				min = 0;
			}
			if(hou == 24) {
				hou = 0;
				min = 0;
				sec = 0;
			}
		}
		System.out.printf("%d %d %d", hou, min, sec);
	}
}