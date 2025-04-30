package controllers;

import views.RegisterView;
import views.StudentsView;

public class StudentsController {
    public void toggleRegisterView() {
        RegisterView view = new RegisterView();
        view.setVisible(true);
    }
}
