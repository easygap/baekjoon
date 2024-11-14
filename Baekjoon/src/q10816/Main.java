package src.q10816;

import java.util.HashMap;
import java.util.Scanner;

/*
 * @Author : ljs
 * @Date : 2024. 11. 06.
 * @Description : 백준 10816 숫자 카드 2
 * @Link : https://www.acmicpc.net/problem/10816
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성

        int n = sc.nextInt(); // 상근이가 가지고 있는 숫자 카드의 개수

        HashMap<Integer, Integer> map = new HashMap<>(); // 숫자 카드의 숫자와 개수를 저장할 HashMap 객체 생성

        // 숫자 카드의 숫자를 key로, 개수를 value로 map에 저장
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
}
