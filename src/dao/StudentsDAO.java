package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DbConnection;
import models.Student;

public class StudentsDAO {
    private Connection connection = DbConnection.connection;
    
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

        if(result.next()) {
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

        if(result.next()) {
             /// return new Student();
        }

        return null;
    }

    public boolean registerUser(Student student) throws SQLException {
        String sql = "INSERT INTO students () VALUES ()";

        return true;
    }
}
