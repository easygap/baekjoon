package q2559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * @Author : ljs
 * @Date : 2025. 11. 13.
 * @Description : 백준 2559
 * @Link : https://www.acmicpc.net/problem/2559
 */
public class Main {
    public static int hgstTemp(int[] temp, int seq) {
        int left = 0;    // 좌측 포인터
        int right = seq - 1;    // 우측 포인터

        int tmpSum = IntStream.rangeClosed(left, right)    // 첫 구간의 날짜 합
                    .map(i -> temp[i])
                    .sum();

        int max = tmpSum;    // 연속된 날짜의 가장 큰 합계 초기화

        while (right < temp.length - 1) {
            right++;    // 우측 포인터를 우측으로 한칸 이동
            tmpSum += temp[right];    // 새로 포함되는 값
            tmpSum -= temp[left];    // 제외되는 값
            left++;    // 좌측 포인터를 우측으로 한칸 이동

            max = Math.max(max, tmpSum);    // 더 큰 값을 max로 변경
        }

        return max;    // 최대합 리턴
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);    // 전체 날짜의 개수
            int k = Integer.parseInt(input[1]);    // 연속적인 날짜의 수

            String[] arr = br.readLine().split(" ");    // 수열에 포함되는 수 입력
            int[] tempArr = new int[n];    // 각 일자별 온도

            for(int i = 0; i < n; i++) {
                tempArr[i] = Integer.parseInt(arr[i]);    // 문자열을 정수로 변환하여 배열에 저장
            }

            System.out.println(hgstTemp(tempArr, k));    // 결과 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
