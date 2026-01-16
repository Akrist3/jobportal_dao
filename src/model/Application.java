package model;

public class Application {

    private int jobId;
    private int userId;
    private String status;

    public Application(int jobId, int userId, String status) {
        this.jobId = jobId;
        this.userId = userId;
        this.status = status;
    }

    public int getJobId() {
        return jobId;
    }

    public int getUserId() {
        return userId;
    }

    public String getStatus() {
        return status;
    }
}
