package src.q9375;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * * @Author : ljs
 * * @Date : 2025. 07. 11.
 * * * @Description : 백준 9375
 * * * @Link : https://www.acmicpc.net/problem/9375
 */
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();    // 테스트 케이스 개수

        while(t-- > 0) {
            int n = sc.nextInt();    // 의상 개수
            Map<String, Integer> map = new HashMap<>();    // 의상 종류별 개수

            for(int i = 0; i < n; i++) {
                sc.next();    // 의상 이름 사용 X
                String type = sc.next();    // 의상 종류

                map.put(type, map.getOrDefault(type, 0 ) + 1);    // 의상 종류별 개수 + 1
            }

            int result = 1;    // 결과 초기화

            for(int count : map.values()) {
                result *= (count + 1);    // 결과 (안입는 경우 추가)
            }
            System.out.println(result - 1);    // 아무것도 입지 않는 경우 제외하고 출력
        }
    }
}