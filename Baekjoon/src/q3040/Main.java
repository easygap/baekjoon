package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] dwarf = new int[9];
		
		for(int i=0; i < dwarf.length; i++) {
			dwarf[i] = sc.nextInt();
		}
		
		sc.close();
		
		int sum = 0;
		
		for(int i = 0; i < dwarf.length; i++) {
			sum += dwarf[i];
		}

		for(int i = 0; i < dwarf.length; i++) {
			for(int j = 0; j < dwarf.length; j++) {
				if(i != j) {
					int svnSum = sum - dwarf[i] - dwarf[j];
					if(svnSum == 100) {
						for(int a = 0; a < dwarf.length; a++) {
							if(a != i && a != j) {
								System.out.println(dwarf[a]);
							}
						}
						System.exit(0);
					} 
				}
			}
		}
	}
}