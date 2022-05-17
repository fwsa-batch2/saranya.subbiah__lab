package conector;
import java.sql.*;

public class display {
public static void main (String[] args) {
     String url = "jdbc:mysql:localhost://3306/Blazers";
     String user = "Saran";
     String pass = "Saranya";
    try {
       Connection connection = DriverManager.getConnection(url, user, pass);
       String sql = "select * from Students";
       PreparedStatement statement = connection.prepareStatement(sql);
       ResultSet ans = statement.executeQuery();
       while(ans.next()) {
           int id = ans.getInt(1);
           String Name = ans.getString(2);
           int Age = ans.getInt(3);
           System.out.println("Id:  " +id+ "  " + "Name: " +Name+ "  " + "Age: " +Age);
        }
        connection.close();
     }
     catch(SQLException e) {
         System.out.println("Error");
         e.printStackTrace();
     }
   }
}