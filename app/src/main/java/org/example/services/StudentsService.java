package org.example.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.models.Student;

import org.example.db.DbConnection;

public class StudentsService {
    private Connection connection = DbConnection.getConnection();

    public List<Student> getAllStudents() throws SQLException {
        // se hace una lista

        /*
         * Registros desde una base de datos
         * Formularios donde no sabes cuántos datos entrarán
         * Lecturas dinámicas desde archivos, red, etc.
         * 
         * usa una lista dinámica (ArrayList) en lugar de un arreglo (Student[])
         * porque es más flexible y práctica.
         */
        List<Student> students = new ArrayList<>();

        String sql = "SELECT * FROM students";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet result = statement.executeQuery();

        while (result.next()) {
            Student student = new Student(
                result.getString("control_number"),
                result.getString("name"),
                result.getString("father_last_name"),
                result.getString("mother_last_name"),
                result.getString("email"),
                result.getString("career"),
                result.getString("semester")

            );

            students.add(student);
        }

        return students;
    }

    public Student getStudentByControlNumber(String controlNumber) throws SQLException {
        String sql = "SELECT * FROM students WHERE control_number = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, controlNumber);

        ResultSet result = statement.executeQuery();

        if (result.next()) {
            String control = result.getString("control_number");
            String name = result.getString("name");
            String fathersLastName = result.getString("father_last_name");
            String mothersLastName = result.getString("mother_last_name");
            String email = result.getString("email");
            String semester = result.getString("semester");
            String career = result.getString("career");

            return new Student(control, name, fathersLastName, mothersLastName, career, semester, email);
        }

        return null;
    }

    public boolean registerStudent(Student student) throws SQLException {
        String sql = "INSERT INTO students (control_number, name, father_last_name, mother_last_name, email, career, semester) VALUES (?, ?, ?, ?, ? ,? ,?)";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, student.getId());
        statement.setString(2, student.getName());
        statement.setString(3, student.getFatherLastName());
        statement.setString(4, student.getMotherLastName());
        statement.setString(5, student.getEmail());
        statement.setString(6, student.getCareer());
        statement.setString(7, student.getSemester());

        int rowsInserted = statement.executeUpdate();
        return rowsInserted > 0;
    }

    public Student deletedStudent(String controlNumber) throws SQLException {
        Student founded = getStudentByControlNumber(controlNumber);

        if (founded == null) {
            return null; // No se encontró el estudiante
        }

        String sql = "DELETE FROM students WHERE control_number = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, controlNumber);

        int rows = statement.executeUpdate();

        if (rows > 0) {
            return founded; // Retorna el estudiante eliminado
        }

        return null;
    }   

    public Student updateStudent(Student student) throws SQLException { 
        String sql = "UPDATE students SET name = ?, father_last_name = ?, mother_last_name = ?, email = ?, career = ?, semester = ? WHERE control_number = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, student.getName());
        statement.setString(2, student.getFatherLastName());
        statement.setString(3, student.getMotherLastName());
        statement.setString(4, student.getEmail());
        statement.setString(5, student.getCareer());
        statement.setString(6, student.getSemester());
        statement.setString(7, student.getId());

        int rowsUpdated = statement.executeUpdate();

        if (rowsUpdated > 0) {
            return getStudentByControlNumber(student.getId());
        }

        return null;
    }
}
