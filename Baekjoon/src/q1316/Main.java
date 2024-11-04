package src.q1316;

import java.util.Scanner;

/*
* @Author : ljs
* @Date : 2024. 11. 04.
* @Description : 백준 1316 그룹 단어 체커
* @Link : https://www.acmicpc.net/problem/1316
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 입력 받을 단어 개수
        int count = 0; // 그룹 단어 개수 카운트
        for(int i = 0; i < num; i++) {
            String str = sc.next();
            if(checkGroupWord(str)) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }

    /*
    * description : 그룹 단어인지 확인하는 함수
    * params : 단어 (String)
    * return : 그룹단어 여부 (boolean)
    */
    private static boolean checkGroupWord(String str) {
        boolean[] check = new boolean[26]; // 알파벳 소문자 개수
        int prev = 0; // 이전 알파벳
        for(int i = 0; i < str.length(); i++) { // 단어의 길이만큼 반복
            int now = str.charAt(i); // 현재 알파벳
            if(prev != now) { // 이전 알파벳과 현재 알파벳이 다르면
                if(!check[now - 'a']) { // 현재 알파벳이 이전에 나온 적이 없으면
                    check[now - 'a'] = true; // 현재 알파벳을 true로 변경
                    prev = now; // 이전 알파벳을 현재 알파벳으로 변경
                } else {
                    return false; // 현재 알파벳이 이전에 나온 적이 있으면 그룹 단어가 아님
                }
            }
        }
        return true;
    }
}
