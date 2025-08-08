package q17356;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 08. 08.
 * @Description : 백준 17356
 * @Link : https://www.acmicpc.net/problem/17356
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a  = Integer.parseInt(input[0]);    // 욱의 욱제력
        int b = Integer.parseInt(input[1]);     // 제의 욱제력

        double m = (double) (b - a) / 400;

        System.out.println(1 / (1 + Math.pow(10, m)));
    }
}
