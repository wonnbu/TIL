package week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 변수 선언
        int count;
        String[] lions;

        Scanner sc = new Scanner(System.in);

        // 2. 아기사자 수 입력
        System.out.print("저장할 아기사자 수를 5 이상 입력하세요: ");
        count = sc.nextInt();

        // 3. 5 미만이면 다시 입력 (검증)
        while (count < 5) {
            System.out.println("[오류] 5 이상 입력해야 합니다.");
            System.out.print("저장할 아기사자 수를 5 이상 입력하세요: ");
            count = sc.nextInt();
        }

        // 4. 배열 생성
        lions = new String[count];
        sc.nextLine(); // 버퍼 제거 (중요)

        // 5. 이름 입력 및 저장
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 아기사자 이름 입력: ");
            lions[i] = sc.nextLine();
        }

        // 6. 최종 명단 출력
        System.out.println("\n=== 아기사자 명단 ===");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + lions[i]);
        }

        // 7. 종료
        sc.close();

    }

}
