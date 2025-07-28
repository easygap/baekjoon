package src.q2959;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author : ljs
 * @Date : 2025. 07. 23.
 * @Description : 백준 2959
 * @Link : https://www.acmicpc.net/problem/2959
 */
public class Main {
    public static  void  main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] length = new String[4];    // 네 변의 길이를 저장할 배열
            length = br.readLine().split(" ");    // 입력받은 변의 길이
            br.close();   // BufferedReader 닫기

            int[] num = new int[4];    // 문자열 배열을 정수 배열로 변환하기 위한 배열
            for (int i = 0; i < length.length; i++) {
                num[i] = Integer.parseInt(length[i]);    // 문자열을 정수로 변환 후 다시 문자열로 변환
            }

            Arrays.sort(num);
            System.out.println(num[2] * num[0]);    // 가장 큰 직사각형 면적
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
