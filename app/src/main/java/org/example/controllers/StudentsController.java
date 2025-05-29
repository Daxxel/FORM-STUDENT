package org.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.example.models.Student;
import org.example.services.StudentsService;
import org.example.view.RegisterView;

public class StudentsController {
    private StudentsService services;
    List<Student> students = new ArrayList<Student>();

    public StudentsController() {
        services = new StudentsService();
    }

    public void toggleRegisterView() {
        RegisterView view = new RegisterView();
        view.setVisible(true);
    }

    public void toggleRegisterView(Student student) {
        RegisterView view = new RegisterView(student);
        view.setVisible(true);
    }

    public List<Student> getAll() {
        try {
            students = services.getAllStudents();
            return students;
        } catch (Exception e) {
            return null;
        }
    }

    public Student getStudent(String controlNumber) {
        try {
            return services.getStudentByControlNumber(controlNumber);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Student deletedStudent(String controlNumber) {
        try {
            Student result = services.deletedStudent(controlNumber);
            students.removeIf(student -> result.getId().equals(controlNumber));

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
