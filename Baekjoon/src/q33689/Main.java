package q33689;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 08. 20.
 * @Description : 백준 33689
 * @Link : https://www.acmicpc.net/problem/33689
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine().trim();
            if (!s.isEmpty() && s.charAt(0) == 'C')    // 각 문자열의 첫 글자가 C인지 확인
                cnt++;
        }
        System.out.println(cnt);    // 결과 출력
    }
}
