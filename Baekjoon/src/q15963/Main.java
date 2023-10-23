package q15963;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();
		sc.close();

		if (N.equals(M)) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
	}
}