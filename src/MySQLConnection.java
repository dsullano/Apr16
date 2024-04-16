import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/dbcsit228sullano";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    static Connection getConnection() {

        Connection c = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Database Connection Success");
        }catch(SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        return c;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
