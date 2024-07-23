import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class POSLogic {
    
    public double calculateTax(double sum) {
        return sum * 0.07;
    }

    public double calculateTotal(double sum, double tax) {
        return sum + tax;
    }

    public double calculateChange(double cash, double total) {
        return cash - total;
    }

    public void removeItem(DefaultTableModel model, int selectedRow) {
        model.removeRow(selectedRow);
    }

    public void saveOrderToDatabase(JTable table, String tableName) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rows = model.getRowCount();
        
        String insertSQL = "INSERT INTO orders (table_name, item_name, quantity, price) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            
            for (int i = 0; i < rows; i++) {
                String itemName = model.getValueAt(i, 0).toString();
                int quantity = Integer.parseInt(model.getValueAt(i, 1).toString());
                double price = Double.parseDouble(model.getValueAt(i, 2).toString());

                pstmt.setString(1, tableName);
                pstmt.setString(2, itemName);
                pstmt.setInt(3, quantity);
                pstmt.setDouble(4, price);
                pstmt.addBatch();
            }
            
            pstmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




