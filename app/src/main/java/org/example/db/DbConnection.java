package org.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static Connection connection;

    private static final String URL = "jdbc:postgresql://aws-0-us-east-2.pooler.supabase.com:6543/postgres";
    private static final String USER = "postgres.tvfskzprmajgizgljumb";
    private static final String PASSWORD = "55345LjAlFwBykMN";

    private DbConnection() {}

    public static Connection getConnection() {
        if (connection == null) {
            connection = buildConnection();
        }

        return connection;
    }

    private static Connection buildConnection() {
        try {
            // ESTO NUNCA SE HACE EN ENTORNOS NO ESCOLARES!!!!!
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            return connection;
        } catch (SQLException exception) {
            throw new RuntimeException("Error connecting to the database", exception);
        }
    }

    public static void testConnection() {
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}