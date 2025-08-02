package q27959;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] input = br.readLine().split(" ");

            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            if(m - (n * 100) <= 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
