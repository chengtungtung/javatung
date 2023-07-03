package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		// 確認驅動程式有無載入
		try {
//			Class.forName("tw.org.iii.tutor.MySign");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii?user=root&password=root"); // 跟MYSQL連線
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate("INSERT INTO cust (cname , tel , birthday) VALUE ('peter','321','1999-03-04')");
			System.out.println(n);
			
			
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
