package src.q11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author : ljs
 * @Date : 2025. 07. 25.
 * @Description : 백준 11651
 * @Link : https://www.acmicpc.net/problem/11651
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int[][] points = new int[Integer.parseInt(br.readLine())][2];    // 좌표 저장용 배열
            for(int i = 0; i < points.length; i++) {
                String[] input = br.readLine().split(" ");    // 좌표 입력
                points[i][0] = Integer.parseInt(input[0]);    // x 좌표
                points[i][1] = Integer.parseInt(input[1]);    // y 좌표
            }

            // 좌표 정렬
            Arrays.sort(points, (p1, p2) -> {
                if(p1[1] == p2[1]) {    // y 좌표가 같은 경우
                    return Integer.compare(p1[0], p2[0]);    // x 좌표로 정렬
                } else {    // y 좌표가 다른 경우
                    return Integer.compare(p1[1], p2[1]);    // y 좌표로 정렬
                }
            });

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < points.length; i++) {
                sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");    // 출력 형식 지정
            }
            System.out.print(sb);    // 결과 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
