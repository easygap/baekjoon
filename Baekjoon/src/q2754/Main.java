package src.q2754;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 06. 10.
 * @Description : 백준 2754
 * @Link : https://www.acmicpc.net/problem/2754
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = br.readLine();
            String result = "";

            switch (input) {
                case "A+":
                    result = "4.3";
                    break;
                case "A0":
                    result = "4.0";
                    break;
                case "A-":
                    result = "3.7";
                    break;
                case "B+":
                    result = "3.3";
                    break;
                case "B0":
                    result = "3.0";
                    break;
                case "B-":
                    result = "2.7";
                    break;
                case "C+":
                    result = "2.3";
                    break;
                case "C0":
                    result = "2.0";
                    break;
                case "C-":
                    result = "1.7";
                    break;
                case "D+":
                    result = "1.3";
                    break;
                case "D0":
                    result = "1.0";
                    break;
                case "D-":
                    result = "0.7";
                    break;
                case "F":
                    result = "0.0";
                    break;
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
