


import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class POSLogic {
    public POSLogic(){
    }
    
    public void addItem(JTable table, String itemName, double price) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        boolean itemExists = false;
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 0).equals(itemName)) {
                int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
                double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
                currentQuantity++;
                currentPrice += price;
                model.setValueAt(currentQuantity, i, 1);
                model.setValueAt(currentPrice, i, 2);
                itemExists = true;
                break;
            }
        }
        if (!itemExists) {
            model.addRow(new Object[]{itemName, "1", price});
        }
    }

    public void removeItem(DefaultTableModel model, int selectedRow) {
        int currentQuantity = Integer.parseInt(model.getValueAt(selectedRow, 1).toString());
        double currentTotalPrice = Double.parseDouble(model.getValueAt(selectedRow, 2).toString());
        if (currentQuantity > 1) {
            double unitPrice = currentTotalPrice / currentQuantity;
            double finalPrice = currentTotalPrice - unitPrice;
            currentQuantity--;
            model.setValueAt(currentQuantity, selectedRow, 1);
            model.setValueAt(finalPrice, selectedRow, 2);
        } else {
            model.removeRow(selectedRow);
        }
    }

    public void calculateItemCost(JTable table, JTextField jtxtSubTotal, JTextField jtxtTax, JTextField jtxtTotal, JTextField jtxtBarCode) {
        double sum = 0;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < table.getRowCount(); i++) {
            sum += Double.parseDouble(model.getValueAt(i, 2).toString());
        }
        double cTax = calculateTax(sum);
        jtxtTax.setText(String.format("$ %.2f", cTax));
        jtxtSubTotal.setText(String.format("$ %.2f", sum));
        jtxtTotal.setText(String.format("$ %.2f", sum + cTax));
        jtxtBarCode.setText(String.format("Barcode: %.2f", sum + cTax));
    }

    public double calculateTax(double sum) {
        return (sum * 3.9) / 100;
    }

    public double calculateTotal(double sum, double tax) {
        return sum + tax;
    }

    public double calculateChange(double cash, double total) {
        return cash - total;
    }
}
