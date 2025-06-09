package src.q1764;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 06. 02.
 * @Description : 백준 1764
 * @Link : https://www.acmicpc.net/problem/1764
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt(); // 듣도 못한 사람 수
        int m = sc.nextInt();; // 보도 못한 사람 수

        int count = 0; // 듣보잡

        String[] unHear = new String[n];
        String[] unSee = new String[m];

        for(int i = 0; i < n; i++) {
            unHear[i] = sc.next(); // 듣도 못한 사람
        }

        for(int i = 0; i < m; i++) {
            unSee[i] = sc.next(); // 보도 못한 사람
        }
        sc.close();

        Arrays.sort(unHear);
        Arrays.sort(unSee);

        int i = 0, j = 0; // 두 배열의 인덱스 초기화
        while (i < n && j < m) { // 두 배열 모두 끝까지 탐색할 때까지
            int cmp = unHear[i].compareTo(unSee[j]); // 두 이름 비교
            if (cmp == 0) { // 두 이름이 같으면
                sb.append(unHear[i]).append("\n"); // 결과에 추가
                count++; // 듣보잡 수 증가

                // 두 배열 모두 다음 인덱스로 이동
                i++;
                j++;
            } else if (cmp < 0) { // unHear 이름이 더 앞서면
                i++; // unHear 인덱스만 증가
            } else { // unSee 쪽 이름이 더 앞서면
                j++; // unSee 인덱스만 증가
            }
        }

        System.out.println(count); // 듣보잡 수 출력
        System.out.println(sb); // 듣보잡 출력
    }
}
