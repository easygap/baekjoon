package q10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @Author : ljs
 * @Date : 2025. 07. 29.
 * @Description : 백준 10814
 * @Link : https://www.acmicpc.net/problem/10814
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());    // 회원의 수
            Member[] members = new Member[n];    // 회원 정보 객체

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int age = Integer.parseInt(st.nextToken());    // 나이
                String name = st.nextToken();    // 이름

                members[i] = new Member(age, name);
            }
            br.close();    // bufferedReader 객체 종료

            Arrays.sort(members, (m1,m2) -> m1.age - m2.age);    // 입력 순서 및 나이순 정렬

            StringBuilder sb = new StringBuilder();    // 결과 저장용 StringBuilder

            for (int i = 0; i < members.length; i++) {
                sb.append(members[i].age).append(" ").append(members[i].name).append("\n");
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/** 회원 정보 객체 */
class Member {
    int age;    // 나이
    String name;    // 이름

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}