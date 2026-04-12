package week2.package1;

public class Lion {//설계도
    //필드선언
    public String name;//어디서든
    String major;//default 같은 패키지만 가능
    private int number;//자기 클래스 내부에서만

    //생성자
    public Lion(String name, String major, int number){
        this.name = name;
        this.major = major;
        this.number= number;
    }
    public void printInfo(){
        System.out.println("이름 : "+name+" | 전공 : "+major+" | 기수 : "+number);
    }
    public boolean validate() {
        boolean isValid = true;

        if (name.trim().isEmpty()) {
            System.out.println("이름은 비어 있을 수 없습니다.");
            isValid = false;
        } if (major.trim().isEmpty()) {
            System.out.println("전공은 비어 있을 수 없습니다.");
            isValid = false;
        } if (number < 1) {
            System.out.println("잘못된 아기사자 정보입니다.");
            isValid = false;
        }
        return isValid;
    }
}
