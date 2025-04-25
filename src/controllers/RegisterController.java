package controllers;

import java.sql.SQLException;

import models.Student;
import models.StudentFactory;
import services.StudentsService;
import views.*;

public class RegisterController {
    private RegisterView view;
    private StudentFactory factory = new StudentFactory();
    private StudentsService dao = new StudentsService();


    public void toggleStudents() {
        StudentsView view = new StudentsView();
        view.setVisible(true);
    }

    public void registerStudent(String fullName, String career, String semester) {
        Student student = factory.createStudent(fullName, career, semester);

        try {
            dao.registerStudent(student);
        } catch (SQLException exception) {
        }
    }

    /**
     * TODO! 
     * 
     * 
     */
}
