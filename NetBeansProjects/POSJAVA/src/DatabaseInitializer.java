import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void initializeDatabase() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            Statement stmt = conn.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS orders (" +
                    "order_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "table_name VARCHAR(50) NOT NULL," +
                    "item_name VARCHAR(100) NOT NULL," +
                    "quantity INT NOT NULL," +
                    "price DOUBLE NOT NULL," +
                    "order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
            stmt.execute(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




