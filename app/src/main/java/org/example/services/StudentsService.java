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

        if (result.next()) {
            // Student student = new Student();
            // students.add(student);
        }

        return students;
    }

    public Student getUserById(int id) throws SQLException {
        String sql = "SELECT * FROM students WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, id);

        ResultSet result = statement.executeQuery();

        if (result.next()) {
            /// return new Student();
        }

        return null;
    }

    public boolean registerStudent(Student student) throws SQLException {
        String sql = "INSERT INTO students (control, name, fathers_last_name, mother_last_name, email, career, semester) VALUES (?, ?, ?, ?, ? ,? ,?)";

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
}
