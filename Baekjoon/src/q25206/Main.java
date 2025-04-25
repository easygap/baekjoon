package src.q25206;

import java.util.Scanner;

/**
 * * @Author : ljs
 * * @Date : 2025. 04. 23.
 * * @Description : 백준 25206 너의 평점은
 * * @Link : https://www.acmicpc.net/problem/25206
 */
public class Main {
    static int loop = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0; // 총 평점
        double scoreSum = 0; // 총 학점

        for(int i = 0; i < loop; i++) {
            String major[] = sc.nextLine().split(" "); // 과목명, 학점, 등급
            double grade = 0; // 등급 점수
            double score = Double.parseDouble(major[1]); // 학점

            switch (major[2]) {
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4.0;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3.0;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2.0;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1.0;
                    break;
                case "F":
                    grade = 0.0;
                    break;
                case "P":
                    grade = 0.0;
                    score = 0.0;
                    break;
                default:
                    grade = 0.0;
                    break;
            }
                sum += grade * score; // 총 평점 계산
                scoreSum += score; // 총 학점 계산
            }
        sc.close(); // Scanner 객체 닫기
        System.out.println(sum / scoreSum); // 총 평점 출력
    }
}
