package SQL_SELECT.Task05;

import java.sql.*;


public class Ex01 {
    public static void main(String[] args) throws SQLException {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","myuser", "xxxx");
                Statement stmt = conn.createStatement();
                ){
            try{
                conn.setAutoCommit(false);

                stmt.executeUpdate("insert into books values ( 4001, 'Perter Chan', 'Mahjong 101', 4.4, 4)");
                stmt.executeUpdate("insert into books values (4001, 'Peter Chan', 'Mahjong 102', 4.4, 4)");
            }catch (SQLException ex){
                System.out.println("-- Rolling back changes --");

                ex.printStackTrace();
            }
        }
    }
}
