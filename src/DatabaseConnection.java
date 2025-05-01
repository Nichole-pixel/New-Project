import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/test"; // Replace 'testdb' with your database name
    private static final String USER = "root"; // Default MySQL username
    private static final String PASSWORD = ""; // Default MySQL password (empty for XAMPP)

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        getConnection(); // Test the connection
    }
}