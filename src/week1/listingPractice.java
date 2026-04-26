package week1;
import java.util.Scanner;

public class listingPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 아기사자 수 입력
        int count = 0;

        while (true) {
            System.out.print("아기사자 수를 입력하세요: ");
            count = scanner.nextInt();

            // 2. 입력값 검증 (5 미만이면 재입력)
            if (count >= 5) {
                break;
            } else {
                System.out.println("아기사자 수는 5 이상이어야 합니다. 다시 입력해주세요.");
            }
        }

        // 3. 배열 생성 및 이름 입력
        String[] names = new String[count];
        scanner.nextLine(); // 버퍼 비우기

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 아기사자 이름을 입력하세요: ");
            names[i] = scanner.nextLine();
        }

        // 4. 최종 명단 출력
        System.out.println("\n===== 아기사자 최종 명단 =====");
        System.out.println("총 아기사자 수: " + count + "명");

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        scanner.close();
    }
}

