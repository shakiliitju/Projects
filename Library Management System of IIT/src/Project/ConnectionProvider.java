
package Project;

import java.sql.*;
import com.mysql.jdbc.Connection;


public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsi", "root", "Mysql");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;

        }

    }

}
