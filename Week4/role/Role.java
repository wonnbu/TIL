package week4.role;

import week4.policy.SubmissionPolicy;

public abstract class Role {
    protected String name;
    protected String major;
    protected int generation;
    protected String part;

    public Role(String name, String major, int generation, String part){
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }
    public abstract SubmissionPolicy getPolicy();
    public abstract String getInfo();
    public abstract String getSummary();
    public String getName(){
        return name;
    }
}
