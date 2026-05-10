package Week5.role;

import Week5.policy.StaffSubmissionPolicy;
import Week5.policy.SubmissionPolicy;

public class Staff extends Role{
    public String position;

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
        return "역할: \n"
                + "이름: " + name + " | 전공: " + major + " | 기수: " + generation + " | 파트: " + part
                + "\n직책: " + position;
    }
    @Override
    public String getSummary() {
        return "운영진 | 이름: " + name + " | 전공: " + major + " | 기수: " + generation + " | 파트: " + part
                + "\n직책: " + position;
    }
}
