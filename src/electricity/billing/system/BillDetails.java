package electricity.billing.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BillDetails extends JFrame {
    String meter;
    BillDetails(String meter){
        this.meter =meter;
        setSize(700,650);
        setLocation(400,150);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JTable table = new JTable();

        try{
            DataBase c = new DataBase();
            String query_bill = "select * from bill where meter_no = '"+meter+"'";
            ResultSet resultSet = c.statement.executeQuery(query_bill);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            Logger.getLogger(BillDetails.class.getName()).log(Level.SEVERE, "Failed to load bill details", e);
        }
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0,0,700,650);
        add(sp);

        setVisible(true);
    }
    public static void main(String[] args) {
        new BillDetails("");
    }
}