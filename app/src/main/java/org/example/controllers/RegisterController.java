package org.example.controllers;

import java.sql.SQLException;

import org.example.view.StudentsView;
import org.example.models.Student;
import org.example.services.StudentsService;

public class RegisterController {
    private StudentsService service = new StudentsService();

    public void toggleStudentsView() {
        new StudentsView();
    }

    public String registerStudent(String id, String name, String fathersLastName, String mothersLastName, String email,
            String semester, String career) {
        try {
            validateEmail(email);
            validateControlNumber(id);

            String[] fields = new String[] { name, fathersLastName, mothersLastName };

            validateFields(fields);

            Student student = new Student(id, name, fathersLastName, mothersLastName, email, semester, career);
            service.registerStudent(student);

            return "Usuario registrado correctamente.";
        } catch (SQLException exception) {
            return "Hubo un error inesperado.";
        } catch (Exception exception) {
            return exception.getMessage();
        }
    }

    public String registerStudent(
            String id, String name, String fathersLastName, String email, String semester, String career) {
        try {
            validateEmail(email);
            validateControlNumber(id);

            String[] fields = new String[] { name, fathersLastName };
            validateFields(fields);

            Student student = new Student(id, name, fathersLastName, email, semester, career);
            service.registerStudent(student);

            return "Usuario registrado correctamente.";
        } catch (SQLException exception) {
            exception.printStackTrace();
            return "Hubo un error inesperado.";
        } catch (Exception exception) {
            return exception.getMessage();
        }
    }

    private void validateEmail(String email) throws Exception {
        email.trim();
        boolean emailMatch = email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

        if (!emailMatch) {
            throw new Exception("El email no es válido");
        }
    }

    private void validateControlNumber(String controlNumber) throws Exception {
        boolean idIsValid = controlNumber.matches("^[0-9]+$");
        boolean hasCorrectLength = controlNumber.length() >= "5000000".length();
//poner limite
        if (!idIsValid && !hasCorrectLength) {
            throw new Exception("El numero de control no es válido");
        }

        Student result = service.getStudentByControlNumber(controlNumber);

        if(result != null) {
            throw new Exception("El numero de control ya está registrado");
        }
    }

    private void validateFields(String[] fields) throws Exception {
        for (int index = 0; index < fields.length; index++) {
            String element = fields[index];

            if (element == null || element.isEmpty()) {
                throw new Exception("Campos no válidos");
            }
        }
    }
}
