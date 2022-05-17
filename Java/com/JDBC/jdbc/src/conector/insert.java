package conector;
import java.sql.*;

public class insert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Blazers";
        String User = "Saran";
        String Password = "Saranya";
        try {
            Connection connection = DriverManager.getConnection(url, User, Password);
            String sql = "insert into Students values (1,'Saran',18),(2,'Abi',19),(3,'Jeru',19),(4,'Swetha',17)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("Values added");
            statement.close();
            connection.close();
            }
        catch(SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
