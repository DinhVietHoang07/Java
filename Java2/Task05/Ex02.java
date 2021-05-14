package SQL_SELECT.Task05;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Ex02 {
    public static void main(String[] args) {
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","myuser", "xxxx");
            PreparedStatement pstmt = conn.prepareStatement("insert into books values(?, ?, ?, ?, ?)");
            PreparedStatement pstmtSelect = conn.prepareStatement("select * from books");
        ){
            pstmt.setInt(1, 7001);
            pstmt.setString(2, "Mahjong 101");
            pstmt.setString(3, "Kumar");
            pstmt.setDouble(4, 88.88);
            pstmt.setInt(5, 88);
            int rowsIntserted = pstmt.executeUpdate();
            System.out.println(rowsIntserted + "rows affected.");

            pstmt.setInt(1, 7002);
            pstmt.setString(2, "Mahjong 102");
            rowsIntserted = pstmt.executeUpdate();
            System.out.println(rowsIntserted + "rows affected.");
            ResultSet rset = pstmtSelect.executeQuery();
            while(rset.next()){
                System.out.println(rset.getInt("id") + ", " + rset.getString("author") + ", " + rset.getString("title") + ", " + rset.getDouble("price")+ ", " + rset.getInt("qty"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
