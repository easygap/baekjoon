package q9913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 08. 05.
 * @Description : 백준 9913
 * @Link : https://www.acmicpc.net/problem/9913
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 테스트 케이스

        int[] num =  new int[1001];
        int max = 0;

        // 입력 개수 카운팅
        for(int i = 0; i < N; i++){
            int seq =  Integer.parseInt(br.readLine());
            num[seq]++;
        }

        // 순회하면서 최대 개수 갱신
        for(int i = 0; i < num.length; i++){
            if(max < num[i])
                max = num[i];
        }
        System.out.println(max);    // 결과 출력
    }
}