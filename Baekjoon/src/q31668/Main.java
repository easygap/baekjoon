package q31668;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 08. 16.
 * @Description : 백준 31668
 * @Link : https://www.acmicpc.net/problem/31668
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        System.out.println(m / n * k);
    }
}
