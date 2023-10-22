package q2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test; i++) {
			int dollar = Integer.parseInt(br.readLine());
			int quarter = 25;
			int dime = 10;
			int nickel = 5;
			int penny = 1;
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int count4 = 0;
			
			while(dollar > 0) {
				if(dollar - quarter < 0){
					break;
				}
				dollar = dollar - quarter;
				count1++;
			}
			while(dollar > 0) {
				if(dollar - dime < 0){
					break;
				}
				dollar = dollar - dime;
				count2++;
			}
			while(dollar > 0) {
				if(dollar - nickel < 0){
					break;
				}
				dollar = dollar - nickel;
				count3++;
			}
			while(dollar > 0) {
				if(dollar - penny < 0){
					break;
				}
				dollar = dollar - penny;
				count4++;
			}
			System.out.printf("%d %d %d %d\n", count1, count2, count3, count4);
			
		}
	}
}
