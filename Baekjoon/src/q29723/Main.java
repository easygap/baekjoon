package q29723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @Author : ljs
 * @Date : 2025. 08. 08.
 * @Description : 백준 29723
 * @Link : https://www.acmicpc.net/problem/29723
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);    // 수강한 과목 수
        int m = Integer.parseInt(input[1]);    // 요구 과목 수
        int k = Integer.parseInt(input[2]);    // 공개 과목 수

        // 모든 과목과 점수를 HashMap에 저장
        HashMap<String, Integer> allSubjects = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] subjectInfo = br.readLine().split(" ");
            allSubjects.put(subjectInfo[0], Integer.parseInt(subjectInfo[1]));
        }


        // 공개된 과목들의 점수 합계를 구하고, HashMap에서 해당 과목들을 제거
        int fixedScore = 0;
        for (int i = 0; i < k; i++) {
            String releasedSubject = br.readLine();
            fixedScore += allSubjects.get(releasedSubject); // 점수를 더함
            allSubjects.remove(releasedSubject);            // 맵에서 제거
        }

        List<Integer> nonFixedScores = new ArrayList<>(allSubjects.values());    // 남은 과목들의 점수만 List로 추출

        Collections.sort(nonFixedScores);    // 남은 과목들의 점수를 오름차순으로 정렬

        int remainingSubjectsToChoose = m - k;    // 추가로 선택해야 할 남은 과목 수 계산

        int minScore = fixedScore;    // 최소 점수
        int maxScore = fixedScore;    // 최대 점수

        // 최소 점수 계산
        for (int i = 0; i < remainingSubjectsToChoose; i++) {
            minScore += nonFixedScores.get(i);
        }

        // 최대 점수 계산
        for (int i = 0; i < remainingSubjectsToChoose; i++) {
            maxScore += nonFixedScores.get(nonFixedScores.size() - 1 - i);
        }

        System.out.println(minScore + " " + maxScore);    // 결과 출력
    }
}
