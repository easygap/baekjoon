import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		sc.close();
		
		char[] word = s.toCharArray();

		for (char chr : word) {

			Integer count = map.get(chr);

			if (count == null) {
				map.put(chr, 1);
			} else {
				map.put(chr, count + 1);
			}

		}

		for (char key : map.keySet()) {
			if((int)key < 91) {
				key = (char) (key +32);
			}
			System.out.println(key + " : " + map.get(key));
		}
	}
}