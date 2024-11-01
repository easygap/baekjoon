package src.q2941;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String croaStr = sc.next();
        String[] croa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        if (croaStr.length() <= 100) {
            for (int i = 0; i < croa.length; i++) {
                if (croaStr.contains(croa[i])) {
                    croaStr = croaStr.replace(croa[i], " ");
                }
            }
            System.out.println(croaStr.length());
        }
        sc.close();
    }
}
