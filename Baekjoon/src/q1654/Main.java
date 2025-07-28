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
            String[] input = br.readLine().split(" ");    // [가지고 있는 랜선 개수, 필요한 최소 랜선 개수]
            k = Integer.parseInt(input[0]);    // 가지고 있는 랜선 개수
            n = Integer.parseInt(input[1]);    // 필요한 최소 랜선 개수

            long maxLength = 0;    // 랜선의 최대 길이
            long minLength = 1;    // 랜선의 최소 길이
            // 랜선 길이 배열 초기화
            l = new int[k];
            for(int i = 0; i < k; i++) {
                l[i] = Integer.parseInt(br.readLine());
                if(l[i] > maxLength) {
                    maxLength = l[i];    // 최대 길이 갱신
                }
            }

            long answer = 0;    // 잘린 랜선의 최대 길이
            while (minLength <= maxLength) {
                long mid = (minLength + maxLength) / 2;    // 중간 길이 계산
                if (check(mid)) {
                    answer = mid;
                    minLength = mid + 1;    // 개수가 충분, 길이를 올림
                } else {
                    maxLength = mid - 1;    // 개수가 부족, 길이를 줄임
                }
            }
            System.out.println(answer);    // 잘린 랜선의 최대 길이 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** 결정문제 함수 */
    public static boolean check(long mid) {
        long sum = 0;    // 잘린 랜선 길이 합
        for (int i = 0; i < k; i++) {
            sum += l[i] / mid;    // 잘린 랜선 길이 계산
        }
        return sum >= n;    // 잘린 랜선 길이 합이 필요한 랜선 개수 이상인지 확인
    }
}
