import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    private String hostName = "localhost:3306";
    private String dbName = "quanlydiem";
    private String username = "root";
    private String password = "1";

    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){
        //Tạo đối tượng Connection
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Kết nối thành công");
            System.out.println("hi");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
