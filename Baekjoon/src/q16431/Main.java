package q16431;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @Author : ljs
 * @Date : 2025. 08. 18.
 * @Description : 백준 16431
 * @Link : https://www.acmicpc.net/problem/16431
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int BR = Integer.parseInt(st.nextToken());
        int BC = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int DR = Integer.parseInt(st.nextToken());
        int DC = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int JR = Integer.parseInt(st.nextToken());
        int JC = Integer.parseInt(st.nextToken());

        int bessie = Math.max(Math.abs(BR - JR), Math.abs(BC - JC));    // 베시 최단 시간
        int daisy = Math.abs(DR - JR) + Math.abs(DC - JC);    // 데이지 최단 시간

        if (bessie < daisy) {
            System.out.println("bessie");
        } else if (bessie > daisy) {
            System.out.println("daisy");
        } else {
            System.out.println("tie");
        }
    }
}