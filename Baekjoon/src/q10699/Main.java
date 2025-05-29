package src.q10699;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // 현재 날짜 구하기

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 포맷 정의

        String formatedDate = now.format(formatter);
        System.out.println(formatedDate); // 포맷된 날짜 출력
    }
}
