package src.q14626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 07. 18.
 * @Description : 백준 14626
 * @Link : https://www.acmicpc.net/problem/14626
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] isbn = br.readLine().split("");
            br.close();

            int index = 0;    // '*'의 위치
            int sum = 0;    // 합계
            for (int i = 0; i < 13; i++) {
                if (isbn[i].equals("*")) {
                    index = i;    // '*'의 위치 저장
                    continue;
                }

                int val = Integer.parseInt(isbn[i]);
                if(i % 2 != 0) {
                    val = val * 3;    // 짝수 자리 숫자
                }
                sum += val;
            }
            for(int i = 0; i <= 9; i++) {
                int total = sum;    // 반복문 마다 합계로 초기화
                if(index % 2 != 0) {
                    total += i * 3;
                } else {
                    total += i;
                }
                if(total % 10 == 0) {    // ISBN 조건 체크
                    System.out.println(i);
                    return;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
            }
    }
}
