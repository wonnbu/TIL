package Week5.role;

import Week5.policy.LionSubmissionPolicy;
import Week5.policy.SubmissionPolicy;

public class Lion extends Role{
    public int studentNumber;

    public Lion(String name, String major, int generation, String part, int studentNumber){
        super(name, major, generation, part);
        this.studentNumber = studentNumber;
    }
    @Override
    public SubmissionPolicy getPolicy() {
        return new LionSubmissionPolicy();
    }

    @Override
    public String getInfo() {
        return "역할: 아기사자\n"
                + "이름: " + name + " | 전공: " + major + " | 기수: " + generation + " | 파트: " + part
                + "\n학번: " + studentNumber;
    }
    @Override
    public String getSummary() {
        return "아기사자 | 이름: " + name + " | 전공: " + major + " | 기수: " + generation + " | 파트: " + part
                + "\n학번: " + studentNumber;
    }
}
