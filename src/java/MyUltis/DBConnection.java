package MyUltis;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NhanNT
 */
public class DBConnection {
    static Connection con = null;
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/review_real_estate";
            String username = "root";
            String password = "";

            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = (Connection) DriverManager.getConnection(url, username, password);
            
        } catch (SQLException ex) {
            System.out.println("Aaaaaa");
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return con;
        }

    }
}
