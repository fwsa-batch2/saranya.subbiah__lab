package conector;
import java.sql.*;
public class jdbc {
		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306";
			String user = "Saran";
			String password = "Saranya";
			try {
				Connection connection=DriverManager.getConnection(url,user,password);
				String sql="Create database Blazers" ;
				Statement fresh= connection.createStatement();
				fresh.execute(sql);
				System.out.println("Database created");
			}
			catch(Exception e){
				System.out.println("No Exception");
				e.printStackTrace();
			}
		}
	}

