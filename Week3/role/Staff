package week3.role;

import week3.policy.Policy;
import week3.policy.StaffPolicy;

public class Staff extends Role{
    public String position;

    public Staff(String name, String major, int generation, String part, String position){
        super(name, major, generation, part);
        this.position = position;
    }
    @Override
    public Policy getPolicy() {
        return new StaffPolicy();
    }

    @Override
    public String getInfo() {
        return "역할: \n"
                + "이름: " + name + " | 전공: " + major + " | 기수: " + generation + " | 파트: " + part
                + "\n직책: " + position;
    }
}
