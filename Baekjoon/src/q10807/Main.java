package q10807;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int count = 0;						
        int r = sc.nextInt();
        int[] num = new int[r];				

        for(int i = 0; i < r; i++) {
            num[i] = sc.nextInt();			
        }
        int sec = sc.nextInt();		
        
        sc.close();

        for(int j = 0; j < num.length; j++){ 
            if(sec == num[j]){				 
                count++;
            }
        }
        System.out.println(count);
    }
}