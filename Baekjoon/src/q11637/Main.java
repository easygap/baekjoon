package src.q11637;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 07. 23.
 * @Description : 백준 11637
 * @Link : https://www.acmicpc.net/problem/11637
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());    // 테스트 케이스 수
            for (int i = 0; i < n; i++) {
                int cntCandidate = Integer.parseInt(br.readLine());    // 후보자 수

                int[] votes = new int[cntCandidate];    // 후보자별 투표 수
                int sum = 0;    // 전체 투표 수 합계 초기화

                for (int j = 0; j < cntCandidate; j++) {
                    votes[j] = Integer.parseInt(br.readLine());    // 각 후보자별 투표 수 입력
                    sum += votes[j];    // 전체 투표 수 합계 계산
                }

                int maxvote = Integer.MIN_VALUE;    // 최다 투표 수
                int maxIndex = Integer.MIN_VALUE;    // 최다 투표 후보자 번호

                boolean isTie = false;    // 동점자 여부

                for(int j = 0; j < cntCandidate; j++) {
                    if(votes[j] > maxvote) {
                        maxvote = votes[j];    // 최다 투표 수 갱신
                        maxIndex = j;    // 최다 투표 후보자 번호 갱신
                        isTie = false;    // 동점자 초기화
                    } else if(votes[j] == maxvote) {
                        isTie = true;    // 동점자 발생
                    }
                }

                if(isTie) {
                    System.out.println("no winner");    // 동점자 발생 시 "no winner" 출력
                } else if (maxvote > (sum / 2)) {
                    System.out.println("majority winner " + (maxIndex + 1));    // 최다 투표 후보자가 전체 투표의 절반 이상을 얻은 경우
                } else {
                    System.out.println("minority winner " + (maxIndex + 1));    // 최다 투표 후보자가 전체 투표의 절반 미만을 얻은 경우
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
