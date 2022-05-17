package conector;
import java.sql.*;

public class createtable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Blazers";
        String User = "Saran";
        String Pass = "Saranya";
        try {
            Connection connection = DriverManager.getConnection(url,User,Pass);
            String sql = "create table Students (id int primary key auto_increment, Name varchar(25), Age tinyint)";
            Statement fresh = connection.createStatement();
            fresh.executeUpdate(sql);
            System.out.println("Table created");
            }
        catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
