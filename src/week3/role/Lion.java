package week3.role;

import week3.policy.LionPolicy;
import week3.policy.Policy;

public class Lion extends Role{
    public int studentNumber;

    public Lion(String name, String major, int generation, String part, int studentNumber){
        super(name, major, generation, part);
        this.studentNumber = studentNumber;
    }
    @Override
    public Policy getPolicy() {
        return new LionPolicy();
    }

    @Override
    public String getInfo() {
        return "역할: 아기사자\n"
                + "이름: " + name + " | 전공: " + major + " | 기수: " + generation + " | 파트: " + part
                + "\n학번: " + studentNumber;
    }
}
