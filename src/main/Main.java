package main;

import dao.ApplicationDAO;

public class Main {
    public static void main(String[] args) {

        ApplicationDAO applicationDAO = new ApplicationDAO();
        applicationDAO.viewApplications();
    }
}
