package week4.role;

import week4.policy.LionSubmissionPolicy;
import week4.policy.SubmissionPolicy;
import week4.role.Role;

public class Lion extends Role {
    public int studentNumber;//private상없?

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
        return "[아기사자] " + name + " - " + generation + "기";
    }
}
