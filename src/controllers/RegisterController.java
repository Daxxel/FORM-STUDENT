package controllers;

import java.sql.SQLException;

import models.Student;
import models.StudentFactory;
import services.StudentsService;
import views.*;

public class RegisterController {
    private StudentFactory factory = new StudentFactory();
    private StudentsService dao = new StudentsService();

    public void toggleStudents() {
        StudentsView view = new StudentsView();
        view.setVisible(true);
    }

    public void registerStudent(String fullName, String career, String semester) {
        try {
            Student student = factory.createStudent(fullName, career, semester);
            dao.registerStudent(student);

        } catch (SQLException exception) {
            
        }
    }
}
