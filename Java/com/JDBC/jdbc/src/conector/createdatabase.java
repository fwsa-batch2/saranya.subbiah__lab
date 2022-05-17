package conector;
import java.sql.*;
public class createdatabase {
		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306";
			String user = "Saran";
			String password = "Saranya";
			try {			
				Connection connection=DriverManager.getConnection(url,user,password);
				String sql="Create database lo" ;
				Statement fresh= connection.createStatement();
				fresh.execute(sql);
				System.out.println("Database create agiduchu da venna");
			}catch(Exception e){
				System.out.println("illa veliya po da");
				e.printStackTrace();
			}
		}
	}

