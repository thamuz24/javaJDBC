package practice;

import practice.ConnectionJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        ConnectionJDBC connectJDBC = new ConnectionJDBC();
        Connection conn = connectJDBC.connect();
        String query = "SELECT * FROM KETQUA";

        Statement stm = null;
        try {
            stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                String masv = rs.getString("masv");
                String mahm = rs.getString("mamh");
                int lanthi = rs.getInt("lanthi");
                double diemthi = rs.getDouble("diemthi");
                System.out.println(masv + " - " + mahm + " - " + lanthi + " - " + diemthi);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}