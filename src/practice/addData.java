package practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addData {
    public static void main(String[] args) {
        ConnectionJDBC connectJDBC = new ConnectionJDBC();
        Connection conn = connectJDBC.connect();

        String query = "insert into users(userName, password, email)" + "values (?,?,?)";
        PreparedStatement pstm = null;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1,"Do Bich Thuan");
            pstm.setString(2,"123456789");
            pstm.setString(3,"thuan.do.@codegym.vn");
            int row = pstm.executeUpdate();
            if (row != 0) {
                System.out.println("them thanh cong " + row);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
