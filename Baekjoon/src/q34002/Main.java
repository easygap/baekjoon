package src.q34002;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : ljs
 * @Date : 2025. 045. 29.
 * @Description : 백준 34002
 * @Link : https://www.acmicpc.net/problem/34002
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            // 첫 번째 줄 입력 및 저장
            String[] firstLine = br.readLine().split(" ");
            int def = Integer.parseInt(firstLine[0]); // 이벤트 맵에서 얻을 수 있는 경험치
            int spc = Integer.parseInt(firstLine[1]); // 심신 수련관에서 얻을 수 있는 경험치
            int vip = Integer.parseInt(firstLine[2]); // vip 사우나에서 얻을 수 있는 경험치

            // 두 번째 줄 입력 및 저장
            String[] secondLine = br.readLine().split(" ");
            int spcTck = Integer.parseInt(secondLine[0]); // 심신 수련관 입장권 개수
            int vipTck = Integer.parseInt(secondLine[1]); // vip 사우나 입장권 개수

            // 세 번째 줄 입력 및 저장
            int lv = Integer.parseInt(br.readLine()); // 현재 본캐 레벨
            br.close();

            int diffExp = (250 - lv) * 100; // 만렙까지 남은 경험치
            int time = 0; // 만렙까지 걸린 시간

            while(diffExp > 0) {
                if(vipTck > 0) {
                    vipTck--; // vip 사우나 입장권 사용
                    for(int i = 0; i < 30; i++) {
                        diffExp -= vip; // 사우나 맵에서 경험치 증가
                        time += 1; // 1분 증가
                        if(diffExp <= 0) {
                            break; // 만렙 도달 시 루프 종료
                        }
                    }
                }
                else if(spcTck > 0) {
                    spcTck--; // 심신 수련관 입장권 사용
                    for(int i = 0; i < 30; i++) {
                        diffExp -= spc; // 수련관 맵에서 경험치 증가
                        time += 1; // 1분 증가
                        if(diffExp <= 0) {
                            break; // 만렙 도달 시 루프 종료
                        }
                    }
                }
                else {
                    diffExp -= def; // 이벤트 맵에서 경험치 증가
                    time += 1; // 1분 증가
                    if(diffExp <= 0) {
                        break; // 만렙 도달 시 루프 종료
                    }
                }
            }
            System.out.println(time); // 만렙까지 걸린 시간 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
