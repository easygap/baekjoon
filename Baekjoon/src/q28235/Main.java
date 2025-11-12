package q28235;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 08. 13.
 * @Description : 백준 28235
 * @Link : https://www.acmicpc.net/problem/28235
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String slogan =  br.readLine();

        if(slogan.equals("SONGDO")){
            System.out.println("HIGHSCHOOL");
        } else if (slogan.equals("CODE")) {
            System.out.println("MASTER");
        } else if (slogan.equals("2023")) {
            System.out.println("0611");
        } else if (slogan.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        } else {
            System.out.println("error");
        }
    }
}
