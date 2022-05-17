package conector;
import java.sql.*;

public class update {
    public static void main(String[] args) {
        String url = "jdbc:mysql:localhost://3306/Blazers";
        String user = "Saran";
        String pass = "Saranya";
        try {
           Connection connection =  DriverManager.getConnection(url, user, pass);
           String sql = "update students set age=18 where id=3";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.executeUpdate(sql);
           System.out.println("Updated");
        }
        catch(SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        
    }
}
