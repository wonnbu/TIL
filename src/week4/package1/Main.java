package week4.package1;

import week4.role.Lion;
import week4.role.Role;
import week4.role.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Role> members = new ArrayList<>();

        while (true) {
            System.out.println("=====멤버 관리 시스템=====");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 전체 멤버 조회");//리스트-foreach문사용
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 종료");
            System.out.print("선택 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.println("--멤버 등록--");
                System.out.print("역할 선택 (1: 아기사자, 2: 운영진) : ");
                int roleSelect = scanner.nextInt();
                scanner.nextLine();
                System.out.print("이름: ");
                String name = scanner.nextLine();

                boolean isDuplicate = false;//중복 검사
                for (Role member : members) {
                    if (member.getName().equals(name)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("등록 실패: 이미 존재하는 이름입니다.");
                    continue;
                }
                System.out.print("전공: ");
                String major = scanner.nextLine();
                System.out.print("기수: ");
                int generation = scanner.nextInt();
                scanner.nextLine();
                System.out.print("파트 (백엔드/프론트엔드/기획/디자인): ");
                String part = scanner.nextLine();

                Role role;
                if (roleSelect == 1) {
                    System.out.print("학번: ");
                    int studentNumber = scanner.nextInt();
                    scanner.nextLine();
                    role = new Lion(name, major, generation, part, studentNumber);
                } else {
                    System.out.print("직책: ");
                    String position = scanner.nextLine();
                    role = new Staff(name, major, generation, part, position);
                }
                members.add(role);
                System.out.println("등록 완료: " + name);

            } else if (menu == 2) {
                System.out.println("--전체 멤버 목록--");
                int index = 1;
                for (Role member : members) {
                    System.out.println(index + ". " + member.getSummary());//
                    index++;
                }
                System.out.println("총 " + members.size() + "명");

            } else if (menu == 3) {
                System.out.println("--이름으로 검색--");
                System.out.print("검색할 이름: ");
                String searchName = scanner.nextLine();

                boolean found = false;//초기는 false
                for (Role member : members) {
                    if (member.getName().equals(searchName)) {
                        System.out.println("[검색 결과]");
                        System.out.println(member.getInfo());
                        System.out.println("과제 제출 가능 여부: " + member.getPolicy().submit());

                        found = true;//리스트 순서대로 찾다가 일치하면 출력
                        break;
                    }
                }
                if (!found) {//if(true)
                    System.out.println("해당 이름의 멤버가 없습니다.");
                }
            } else if(menu == 4){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
