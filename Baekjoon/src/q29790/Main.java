package src.q29790;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 05. 29.
 * @Description : 백준 29790
 * @Link : https://www.acmicpc.net/problem/29790
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 첫 번째 줄 입력 및 저장
            String[] firstLine = br.readLine().split(" ");
            int N = Integer.parseInt(firstLine[0]); // 지원자의 문제 해결 개수
            int U = Integer.parseInt(firstLine[1]); // 유니온 레벨
            int L = Integer.parseInt(firstLine[2]); // 최고 레벨

            int count = 0; // 조건 충족 여부
            if(N >= 1000 && (U >= 8000 || L >= 260))
                System.out.println("Very Good");
            else if (N >= 1000)
                System.out.println("Good");
            else
                System.out.println("Bad");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
