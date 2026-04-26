package week3;

import week3.role.Lion;
import week3.role.Role;
import week3.role.Staff;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("-----아기사자 정보 입력-----");
            System.out.print("이름: ");
            String lName = scanner.nextLine();
            System.out.print("전공: ");
            String lMajor = scanner.nextLine();
            System.out.print("기수: ");
            int lGeneration = scanner.nextInt();
            scanner.nextLine(); //nextInt에 엔터가 먹혀있으니까 nextLine필요
            System.out.print("파트 (백엔드/프론트엔드/기획/디자인): ");
            String lPart = scanner.nextLine();
            System.out.print("학번: ");
            int lStudentNumber = scanner.nextInt();
            scanner.nextLine();

            Role lion = new Lion(lName,lMajor,lGeneration,lPart,lStudentNumber);

            System.out.println("-----운영진 정보 입력-----");
            System.out.print("이름: ");
            String sName = scanner.nextLine();
            System.out.print("전공: ");
            String sMajor = scanner.nextLine();
            System.out.print("기수: ");
            int sGeneration = scanner.nextInt();
            scanner.nextLine(); //nextInt에 엔터가 먹혀있으니까 nextLine필요
            System.out.print("파트 (백엔드/프론트엔드/기획/디자인): ");
            String sPart = scanner.nextLine();
            System.out.print("직책 (대표/부대표/파트장/멘토): ");
            String sPosition = scanner.nextLine();
            System.out.println();

            Role staff = new Staff(sName, sMajor, sGeneration, sPart, sPosition);

            Role[] roles = {lion, staff};
            System.out.println("-----결과 출력-----");
            for(Role role : roles){//배열 사용해서 아기사자랑 운영진 순으로 출력
                System.out.println(role.getInfo());
                System.out.println("제출 가능 여부: " + role.getPolicy().submit());
                System.out.println();
            }

        }
}
