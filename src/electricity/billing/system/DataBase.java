package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {

    Connection connection;
    Statement statement;

    DataBase(){
        try{
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Correct DB name and credentials
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Bill_system",
                    "root", "root123"
            );

            // Initialize statement
            statement = connection.createStatement();
        }
        catch(Exception e){
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, "Failed to initialize database", e);
        }
    }
}
