package org.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static Connection connection;

    String url = "jdbc:postgresql://aws-0-us-east-2.pooler.supabase.com:6543/postgres";
    String user = "postgres.tvfskzprmajgizgljumb";
    String password = "55345LjAlFwBykMN";

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
            Connection connection = DriverManager.getConnection(
                    "postgresql://postgres.tvfskzprmajgizgljumb:55345LjAlFwBykMN@aws-0-us-east-2.pooler.supabase.com:6543/postgres");

            return connection;
        } catch (SQLException exception) {
            throw new RuntimeException("Error connecting to the database", exception);
        }
    }
}