package src.q2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 07. 21.
 * @Description : 백준 2805
 * @Link : https://www.acmicpc.net/problem/2805
 */
public class Main {
    static int n;    // 총 나무의 수
    static long m;    // 필요한 나무의 수
    static long[] trees;    // 나무의 높이

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] input = br.readLine().split(" ");    // [총 나무의 수, 필요한 나무의 수]
            n = Integer.parseInt(input[0]);    // 총 나무의 수
            m = Integer.parseInt(input[1]);    // 필요한 나무의 수

            // 나무의 높이
            String[] treeStr = br.readLine().split(" ");
            trees = new long[n];
            for (int i = 0; i < n; i++) {
                trees[i] = Long.parseLong(treeStr[i]);
            }

            // 최대 높이 구하기
            long maxHeight = 0;    // 나무의 최대 높이
            long lowHeight = 0;    // 나무의 최소 높이
            long tempTree = 0;    // 나무 높이 임시 저장
            for(int i = 0; i < n; i++) {
                tempTree = trees[i];    // 나무의 높이 배열 초기화
                if (tempTree > maxHeight) {
                    maxHeight = tempTree;    // 최대 높이 갱신
                }
            }

            while (lowHeight + 1 < maxHeight) {
                long mid = (lowHeight + maxHeight) / 2;    // 중간 높이 계산
                if (check(mid))
                    lowHeight = mid;    // 잘린 나무 길이 합이 필요한 나무 길이 이상이면 높이를 올림
                else
                    maxHeight = mid;    // 잘린 나무 길이 합이 필요한 나무 길이 미만이면 높이를 내림
            }
            System.out.println(lowHeight);    // 잘린 나무의 최대 높이 출력

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** 결정문제 함수 */
    public static boolean check(long mid) {
        long sum = 0;    // 잘린 나무 길이 합
        for (int i = 0; i < n; i++) {
            long treeHeight = trees[i];    // 나무의 높이
            if(treeHeight > mid)    // 톱 높이보다 높은 나무만
                sum += treeHeight - mid;    // 잘린 나무 길이 계산
        }
        return sum >= m;    // 잘린 나무 길이 합이 필요한 나무 길이 이상인지 확인
    }
}
