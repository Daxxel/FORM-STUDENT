package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String URL = System.getenv("DB_HOST");
    private static final String DB_USER = System.getenv("DB_USER");
    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

    private static Connection connection;

    private DbConnection() {}

    public static Connection getConnection() {
        if(connection == null) {
            connection = buildConnection();
        }

        return connection;
    }

    private static Connection buildConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
            
            return connection;
        } catch (SQLException exception) {
            throw new RuntimeException("Error connecting to the database", exception);
        }
    }
}
