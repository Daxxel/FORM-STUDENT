package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    // privado - ninguna otra clase puede acceder al valor
    // static es que solo va a existir esa única variable
    // final que su valor ya no es modificable

    private static final String URL = System.getenv("");
    private static final String BD_USER = System.getenv("DB_USER");
    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

    // los .env son archivos especiales que guardan información sensible como por
    // ejemplo las credenciales
    // de la base de datos

    public static Connection connection;

    // hacer el constructor privado hace que ninguna otra clase pueda instanciar
    // y que solo exista 1 sola conexión a la base de datos

    // a este patrón se le llama Singleton
    private DbConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(URL, BD_USER, DB_PASSWORD);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
