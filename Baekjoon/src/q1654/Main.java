package src.q1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 07. 18.
 * @Description : 백준 1654
 * @Link : https://www.acmicpc.net/problem/1654
 */
public class Main {
    // 가지고 있는 랜선 개수 K
    // 필요한 최소 랜선 개수 N
    // 랜선 길이 배열 L
    static int k;
    static int n;
    static int[] l;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input[] = br.readLine().split(" ");    // [가지고 있는 랜선 개수, 필요한 최소 랜선 개수]
            k = Integer.parseInt(input[0]);    // 가지고 있는 랜선 개수
            n = Integer.parseInt(input[1]);    // 필요한 최소 랜선 개수

            for(int i = 0; i < k; i++) {
                l[i] = Integer.parseInt(br.readLine());    // 랜선 길이 배열 초기화
            }

            int maxLength = 0;    // 랜선의 최대 길이
            int minLength = 0;    // 랜선의 최소 길이
            for(int i = 0; i < k; i++) {
                if(l[i] > maxLength) {
                    maxLength = l[i];    // 최대 길이 갱신
                }
            }

            while (minLength + 1 < maxLength) {
                int mid = (minLength + maxLength) / 2;    // 중간 길이 계산
                if (check(mid)) {
                    minLength = mid;    // 잘린 랜선 길이 합이 필요한 랜선 길이 이상이면 길이를 올림
                } else {
                    maxLength = mid;    // 잘린 랜선 길이 합이 필요한 랜선 길이 미만이면 길이를 내림
                }
            }
            System.out.println(minLength);    // 잘린 랜선의 최대 길이 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** 결정문제 함수 */
    public static boolean check(int mid) {
        int sum = 0;    // 잘린 랜선 길이 합
        for (int i = 0; i < k; i++) {
            if (l[i] > mid) {    // 중간 길이보다 긴 랜선만
                sum += l[i] / mid;    // 잘린 랜선 길이 계산
            }
        }
        return sum >= n;    // 잘린 랜선 길이 합이 필요한 랜선 개수 이상인지 확인
    }
}
