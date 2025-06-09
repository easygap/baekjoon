package src.q34001;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 05. 29.
 * @Description : 백준 34001
 * @Link : https://www.acmicpc.net/problem/34001
 */
public class Main {
    public static void main(String[] args) {
        int[] arcaneQuest = {200, 210, 220, 225, 230, 235};
        int[][] arcaneReduce = {
                {210, 220}, // 소멸의 여로
                {220, 225}, // 츄츄 아일랜드
                {225, 230}, // 꿈의 도시 레헬른
                {230, 235}, // 신비의 숲 아르카나
                {235, 245}, // 기억의 늪 모라스
                {245, 250}  // 태초의 바다 에스페라
        };
        int[] grandisQuest = {260, 265, 270, 275, 280, 285, 290};
        int[][] grandisReduce = {
                {265, 270}, // 세르니움
                {270, 275}, // 호텔 아르크스
                {275, 280}, // 오디움
                {280, 285}, // 도원경
                {285, 290}, // 아르테리아
                {290, 295}, // 카르시온
                {295, 300}  // 탈라하트
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int level = Integer.parseInt(br.readLine()); // 본캐 레벨

            // 아케인리버
            for (int i = 0; i < arcaneQuest.length; i++) {
                if (level < arcaneQuest[i]) {
                    System.out.print("0");
                } else if (level < arcaneReduce[i][0]) {
                    System.out.print("500");
                } else if (level < arcaneReduce[i][1]) {
                    System.out.print("300");
                } else {
                    System.out.print("100");
                }
                if (i < arcaneQuest.length - 1)
                    System.out.print(" ");
            }
            System.out.println();

            // 그란디스
            for (int i = 0; i < grandisQuest.length; i++) {
                if (level < grandisQuest[i]) {
                    System.out.print("0");
                } else if (level < grandisReduce[i][0]) {
                    System.out.print("500");
                } else if (level < grandisReduce[i][1]) {
                    System.out.print("300");
                } else {
                    System.out.print("100");
                }
                if (i < grandisQuest.length - 1)
                    System.out.print(" ");
            }
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}