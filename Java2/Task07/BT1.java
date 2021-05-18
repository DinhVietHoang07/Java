package SQL_SELECT.EX;


import java.sql.*;
import java.util.function.DoubleToIntFunction;

public class BT1 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "myuse", "xxxx");
                Statement stmt = conn.createStatement();
        ){

            //DELETE records with id> 8000
            String sqlDelete = "delete from books where id >8000";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + "records delete.\n");

            //INSERT a record
            String sqlInsert = "insert into books values (8000, 'Java Core', 'Dinh Viet Hoang', 5.55, 55)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");


            // INSERT multiple records
            sqlInsert = "insert into books values"
                    +"(8001, 'Java Core', 'Dinh Viet Hoang', 15.55, 55)"
                    +"(8002, 'Java Core', 'Dinh Viet Hoang', 25.55, 55)";
            System.out.println("The SQL statement is: " + sqlInsert +"\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            //INSERT a partial record
            sqlInsert = "insert into books (id,title,author) values (2001, 'Java JDBC MySQL', 'Dinh Viet Hoang')";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            //DELETE
            String sqDelete = "delete from books where id ";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countsDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + "records delete.\n");

            // Issue a SELECT to check the changes
            String strSelect = "select * from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("id") + ", "
                        +rset.getString("author") + ", "
                        +rset.getString("title") + ", "
                        +rset.getDouble("price") + ", "
                        +rset.getInt("qty"));
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
