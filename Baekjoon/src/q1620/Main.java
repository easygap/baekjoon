package src.q1620;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Author: ljs
 * Date: 2024. 11. 04.
 * Description: 백준 1620 나는야 포켓몬 마스터 이다솜
 * Link: https://www.acmicpc.net/problem/1620
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> pokemonName = new HashMap<>(); // 포켓몬 이름
        Map<String, Integer> pokemonNum = new HashMap<>(); // 포켓몬 번호
        int pokedex = sc.nextInt(); // 포켓몬 도감 번호
        int num = sc.nextInt(); // 출력할 포켓몬 개수
        sc.nextLine(); // 개행문자 삭제

        // 포켓몬 이름과 번호를 매핑
        for (int i = 1; i <= pokedex; i++) {
            String name = sc.nextLine();
            pokemonName.put(i, name);
            pokemonNum.put(name, i);
        }

        // 출력할 포켓몬 이름 또는 번호 입력
        for (int i = 0; i < num; i++) {
            String input = sc.nextLine();

            // 입력이 숫자인지 문자인지 판별
            if (Character.isDigit(input.charAt(0))) {
                System.out.println(pokemonName.get(Integer.parseInt(input))); // 숫자인 경우
            } else {
                System.out.println(pokemonNum.get(input)); // 문자인 경우
            }
        }
        sc.close();
    }
}