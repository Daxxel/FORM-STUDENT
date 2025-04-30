package org.example.controllers;

import org.example.view.RegisterView;

public class StudentsController {
    public void toggleRegisterView() {
        RegisterView view = new RegisterView();
        view.setVisible(true);
    }
}
