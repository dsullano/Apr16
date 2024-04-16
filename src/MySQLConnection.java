import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/dbcsit228sullano";
    static Connection getConnection() {

        Connection c = null;

        try{
            c = DriverManager.getConnection();
        }catch{}

        return c;
    }
}
