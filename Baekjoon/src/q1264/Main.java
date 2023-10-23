package q1264;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 0;
			String str = sc.nextLine();
			if (str.equals("#"))
				break;
			char[] word = new char[str.length()];

			for (int i = 0; i < word.length; i++) {
				word[i] = str.charAt(i);
				if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u'
						|| word[i] == 'A' || word[i] == 'E' || word[i] == 'I' || word[i] == 'O' || word[i] == 'U') {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}