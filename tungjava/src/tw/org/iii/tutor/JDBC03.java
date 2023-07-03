package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBC03 {

	public static void main(String[] args) {
		
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop); // 跟MYSQL連線
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate("INSERT INTO cust (cname , tel , birthday) VALUE ('amy','321','1999-03-04')");
			System.out.println(n);
			
			
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
