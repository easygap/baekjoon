package q3273;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author : ljs
 * @Date : 2025. 11. 13.
 * @Description : 백준 3273
 * @Link : https://www.acmicpc.net/problem/3273
 */
public class Main {
    public static int twoSum(int[] arr, int target) {
        int left = 0;    // 좌측 포인터
        int right = arr.length - 1;    // 우측 포인터
        int count = 0;    // 조건을 만족하는 쌍의 개수

        while (left < right) {
            int sum = arr[left] + arr[right];    // 두 수의 합
            if (sum == target) {
                count++;    // 만족하는 쌍의 개수 카운팅
                left++;    // 좌측 포인터 + 1
                right--;    // 우측 포인터 - 1
            } else if (sum < target) {
                left++;    // 합이 기준보다 작으면 좌측 포인터를 + 1
            } else {
                right--;    // 합이 기준보다 크면 우측 포인터를 - 1
            }
        }
        return count;    // 만족하는 쌍의 개수 리턴
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());    // 수열의 크기
            int[] arr =  new int[n];    // 수열

            String[] input = br.readLine().split(" ");    // 수열에 포함되는 수 입력

            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);    // 문자열을 정수로 변환하여 배열에 저장
            }

            int x = Integer.parseInt(br.readLine());    // 만족하는 합계

            Arrays.sort(arr);    // 투 포인터 사용을 위한 정렬

            System.out.println(twoSum(arr, x));    // 결과 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}