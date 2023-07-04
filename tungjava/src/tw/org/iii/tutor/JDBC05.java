package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC05 {

	public static void main(String[] args) {
		// 
		String key ="烘焙";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);
//			String sql = "SELECT * FROM foods";
//			String sql = "SELECT id , name as myname FROM foods";
//			String sql = "SELECT * FROM foods WHERE city = ?";
			String sql = "SELECT * FROM foods WHERE name LIKE ? OR addr LIKE ? OR tel LIKE ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "臺中市");
			pstmt.setString(1, "%" + key +"%");
			pstmt.setString(2, "%" + key +"%");
			pstmt.setString(3, "%" + key +"%");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//int id = rs.getInt(1);  // 若要運算，抓回來的資料可以用int
				String id = rs.getString(1);
				String name = rs.getString("name");
//				String name = rs.getString("myname");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				
				System.out.println(String.format("%s : %s , 地址: %s ", id , name , addr , tel));
			}
			
			
			} catch (Exception e) {
			System.out.println(e);
		}

	}

}
