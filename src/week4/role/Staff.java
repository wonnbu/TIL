package week4.role;

import week4.policy.StaffSubmissionPolicy;
import week4.policy.SubmissionPolicy;

public class Staff extends Role {
    private String position;

    public Staff(String name, String major, int generation, String part, String position){
        super(name, major, generation, part);
        this.position = position;
    }
    @Override
    public SubmissionPolicy getPolicy() {
        return new StaffSubmissionPolicy();
    }

    @Override
    public String getInfo() {
        return "역할: 운영진\n"
                + "이름: " + name + " | 전공: " + major + " | 기수: " + generation + " | 파트: " + part
                + "\n직책: " + position;
    }
    @Override
    public String getSummary() {
        return "[운영진] " + name + " - " + generation + "기";
    }
}
