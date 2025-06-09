package src.q11399;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author : ljs
 * @Date : 2025. 05. 30.
 * @Description : 백준 11399
 * @Link : https://www.acmicpc.net/problem/11399
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 사람의 수
        int[] times = new int[n]; // 각 사람이 돈을 인출하는데 걸리는 시간

        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt(); // 각 사람이 돈을 인출하는데 걸리는 시간
        }

        Arrays.sort(times); // 시간을 오름차순으로 정렬

        int resultTime = 0; // 총 시간
        int stackTime = 0; // 누적 시간

        for(int i = 0; i < n; i++){
            stackTime += times[i]; // 누적 시간에 가산
            resultTime += stackTime; // 총 시간에 누적 시간을 더함
        }
        System.out.println(resultTime); // 결과 출력
    }
}
