package conector;
import java.sql.*;

public class delete {
    public static void main (String[] args) {
       String url = "jdbc:mysql:localhost://3306/Blazers";
       String user = "Saran";
       String pass = "Saranya";

       try {
           Connection connection = DriverManager.getConnection(url, user, pass);
           String sql = "delete from Students where id=1";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.executeUpdate(sql);
           System.out.println("Deleted");
       }
       catch(SQLException e) {
           System.out.println("Error");
           e.printStackTrace();
       }
    }
}