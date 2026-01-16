package model;

public class Job {

    private int jobId;
    private int recruiterId;
    private String title;
    private String skills;
    private String location;
    private int salary;

    public Job(int recruiterId, String title, String skills, String location, int salary) {
        this.recruiterId = recruiterId;
        this.title = title;
        this.skills = skills;
        this.location = location;
        this.salary = salary;
    }

    public int getRecruiterId() {
        return recruiterId;
    }

    public String getTitle() {
        return title;
    }

    public String getSkills() {
        return skills;
    }

    public String getLocation() {
        return location;
    }

    public int getSalary() {
        return salary;
    }
}
