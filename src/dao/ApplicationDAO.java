package dao;

import db.DBConnection;
import model.Application;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ApplicationDAO {

    public boolean applyForJob(Application application) {

        String sql = "INSERT INTO applications(job_id, user_id, status, applied_date) " +
                     "VALUES (?, ?, ?, CURDATE())";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, application.getJobId());
            ps.setInt(2, application.getUserId());
            ps.setString(3, application.getStatus());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void viewApplications() {

    String sql =
        "SELECT a.application_id, a.status, j.title, j.location " +
        "FROM applications a " +
        "JOIN jobs j ON a.job_id = j.job_id";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         java.sql.ResultSet rs = ps.executeQuery()) {

        System.out.println("\nJob Applications:\n");

        while (rs.next()) {
            System.out.println("Application ID: " + rs.getInt("application_id"));
            System.out.println("Job Title: " + rs.getString("title"));
            System.out.println("Location: " + rs.getString("location"));
            System.out.println("Status: " + rs.getString("status"));
            System.out.println("---------------------------");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
