package src.q4673;

/**
 * @Author : ljs
 * @Date : 2025. 07. 23.
 * @Description : 백준 4673
 * @Link : https://www.acmicpc.net/problem/4673
 */
public class Main {
    public static void  main(String[] args) {
        boolean[] selfNumber = new boolean[10001];    // 셀프 넘버 범위 1 ~ 10000

        // 셀프 넘버 계산
        for (int i = 1; i < selfNumber.length; i++) {
            int num = calSelfNum(i);    // 1부터 10000까지 셀프 넘버 계산
            if (num < selfNumber.length)    // 셀프 넘버가 10000 이하인 경우
                selfNumber[num] = true;    // 셀프 넘버 표시
        }

        // 출력용 계산
        StringBuilder sb = new StringBuilder();    // 결과 저장용 StringBuilder
        for (int i = 1; i < selfNumber.length; i++) {
            if (!selfNumber[i]) {    // 셀프 넘버가 아닌 경우
                sb.append(i).append("\n");    // 결과 저장
            }
        }

        System.out.println(sb);    // 결과 출력
    }

    /** 셀프 넘버를 구하는 함수 */
    public static int calSelfNum(int n) {
        int sum = n;    // 셀프 넘버 합계
        while (n > 0) {
            sum += n % 10;    // 각 자리수 더하기
            n /= 10;    // 다음 자리수로 이동
        }
        return sum;    // 셀프 넘버 반환
    }
}
