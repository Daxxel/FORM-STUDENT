package org.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.example.models.Student;
import org.example.services.StudentsService;
import org.example.view.RegisterView;

public class StudentsController {
    private StudentsService services;

    public StudentsController() {
        services = new StudentsService();
    }

    public void toggleRegisterView() {
        RegisterView view = new RegisterView();
        view.setVisible(true);
    }

    public List<Student> getAll() {
        try {
            return services.getAllStudents();
        } catch (Exception e) {
            return null;
        }
    }
}
