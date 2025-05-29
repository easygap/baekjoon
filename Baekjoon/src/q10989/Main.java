package src.q10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 05. 09.
 * @Description : 백준 10989
 * @Link : https://www.acmicpc.net/problem/10989
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받기 위한 객체 생성
        StringBuilder sb = new StringBuilder(); // 결과 저장을 위한 객체 생성

        int n = Integer.parseInt(bf.readLine()); // 정수 N 입력
        int[] arr = new int[10001]; // 입력받은 수를 저장할 배열

        // 입력받은 수와 매칭하는 배열의 위치를 카운트
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(bf.readLine())]++; // 해당 인덱스에 1 증가
        }

        // 배열을 순회하면서 각 수의 개수를 저장
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(i).append("\n"); // 배열 위치의 숫자를 순차적으로 저장
                }
            }
        }

        System.out.print(sb); // 결과 출력
        bf.close(); // BufferedReader 닫기
    }
}
