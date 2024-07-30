
import javax.swing.table.DefaultTableModel;


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

    void clearDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    
}




