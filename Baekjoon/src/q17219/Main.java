package src.q17219;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @Author : ljs
 * @Date : 2025. 05. 30.
 * @Description : 백준 17219
 * @Link : https://www.acmicpc.net/problem/17219
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] firstLine = br.readLine().split(" "); // 사이트 개수, 비밀번호 개수 입력
            int n = Integer.parseInt(firstLine[0]); // 사이트 개수
            int m = Integer.parseInt(firstLine[1]); // 비밀번호 개수
            HashMap<String, String> pwdMap = new HashMap<>(); // 사이트와 비밀번호를 저장할 맵
            for(int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" "); // 사이트와 비밀번호 입력
                pwdMap.put(input[0], input[1]); // 맵에 저장
            }

            for(int i = 0; i < m; i++) {
                String site = br.readLine(); // 비밀번호를 찾으려는 사이트 주소
                if(pwdMap.containsKey(site))
                    System.out.println(pwdMap.get(site)); // 사이트가 맵에 존재하면 비밀번호 출력
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
