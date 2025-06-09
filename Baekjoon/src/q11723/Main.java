package src.q11723;

import java.io.BufferedReader;

/**
 * @Author : ljs
 * @Date : 2025. 05. 30.
 * @Description : 백준 11723
 * @Link : https://www.acmicpc.net/problem/11723
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder
        try {
            int m = Integer.parseInt(br.readLine()); // 연산 갯수
            boolean[] numSet = new boolean[21]; // 1부터 20까지의 숫자를 저장할 배열

            for(int i = 0; i < m; i++) {
                String[] input = br.readLine().split(" "); // 연산, 숫자 입력
                String opt = input[0]; // 연산 종류

                int num = 0; // 숫자 초기화
                if(input.length > 1) // all이 들어오는 경우 에러 방지
                    num = Integer.parseInt(input[1]); // 숫자

                switch (opt) {
                    case "add":
                        numSet[num] = true; // 숫자를 집합에 추가
                        break;
                    case "remove":
                        numSet[num] = false; // 숫자를 집합에서 제거
                        break;
                    case"check":
                        if(numSet[num])
                            sb.append(1).append("\n"); // 숫자가 집합에 있으면 1 출력
                        else
                            sb.append(0).append("\n"); // 숫자가 집합에 있으면 0 출력
                        break;
                    case "toggle":
                        numSet[num] = !numSet[num]; // 숫자 존재 여부 반전
                        break;
                    case "all":
                        for(int j = 1; j <= 20; j++) {
                            numSet[j] = true; // 1부터 20까지 모두 집합에 추가
                        }
                        break;
                    case "empty":
                        for(int j = 1; j <= 20; j++) {
                            numSet[j] = false; // 1부터 20까지 모두 집합에서 제거
                        }
                        break;
                }
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
