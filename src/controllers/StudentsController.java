package controllers;

import views.RegisterView;

public class StudentsController {
    public void toggleRegisterView() {
        RegisterView view = new RegisterView();
        view.setVisible(true);
    }
}
