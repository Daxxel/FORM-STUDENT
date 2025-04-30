package controllers;

import java.sql.SQLException;

import models.Student;
import services.StudentsService;
import views.*;

public class RegisterController {
    private StudentsService service = new StudentsService();

    public void toggleStudentsView() {
        StudentsView view = new StudentsView();
        view.setVisible(true);
    }

    public boolean registerStudent(String id, String name, String fathersLastName, String mothersLastName, String email, String semester, String career) {
        try {
            Student student = new Student(id, name, fathersLastName, mothersLastName, email, semester, career);
            service.registerStudent(student);

            return true;
        } catch (SQLException exception) {
            return false;
        }
    }

    public boolean registerStudent(String id, String name, String fathersLastName, String email, String semester, String career) {
        try {
            Student student = new Student(id, name, fathersLastName, email, semester, career);
            service.registerStudent(student);

            return true;
        } catch (SQLException exception) {
            return false;
        }
    }
}
