package dao;

import db.DBConnection;
import model.Job;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JobDAO {

    public boolean postJob(Job job) {

        String sql = "INSERT INTO jobs(recruiter_id, title, skills, location, salary, posted_date) " +
                     "VALUES (?, ?, ?, ?, ?, CURDATE())";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, job.getRecruiterId());
            ps.setString(2, job.getTitle());
            ps.setString(3, job.getSkills());
            ps.setString(4, job.getLocation());
            ps.setInt(5, job.getSalary());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    public void viewAllJobs() {

    String sql = "SELECT job_id, title, skills, location, salary FROM jobs";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         java.sql.ResultSet rs = ps.executeQuery()) {

        System.out.println("\nAvailable Jobs:\n");

        while (rs.next()) {
            System.out.println("Job ID: " + rs.getInt("job_id"));
            System.out.println("Title: " + rs.getString("title"));
            System.out.println("Skills: " + rs.getString("skills"));
            System.out.println("Location: " + rs.getString("location"));
            System.out.println("Salary: " + rs.getInt("salary"));
            System.out.println("---------------------------");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
