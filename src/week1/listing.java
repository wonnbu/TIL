package week1;
import java.util.Scanner;

public class listing {
    public static void main(String[] args) {

        int count;
        String[] lions;

        Scanner sc = new Scanner(System.in);

        System.out.print("저장할 아기사자 수를 5 이상 입력하세요: ");
        count = sc.nextInt();

        while (count < 5) {
            System.out.println("[오류] 5 이상 입력해야 합니다.");
            System.out.print("저장할 아기사자 수를 5 이상 입력하세요: ");
            count = sc.nextInt();
        }
        lions = new String[count];
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 아기사자 이름 입력: ");
            lions[i] = sc.nextLine();
        }
        System.out.println("\n=== 아기사자 명단 ===");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + lions[i]);
        }
        sc.close();
    }
}

