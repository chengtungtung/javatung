package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC09 {

	public static void main(String[] args) {
		// 查詢後做修改
		
		String sql = "SELECT * FROM foods";
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);

			PreparedStatement pstmtLogin = conn.prepareStatement(sql,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = pstmtLogin.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.printf("%s:%s\n", id, name);
			}
			System.out.println("---------");
			if(rs.first()) {
				System.out.println("ok");
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.printf("%s:%s\n", id, name);
				
				System.out.println("---------");
				rs.absolute(4);
				System.out.printf("%s:%s\n", rs.getString("id"),rs.getString("name"));
				
				
//				System.out.println("---------");
//				rs.updateString("name", "卓也田"); // 在記憶體
//				rs.updateString("tel", "04-22334567"); // 在記憶體
//				rs.updateRow();
				
				//rs.deleteRow();
				
				rs.moveToInsertRow();
				rs.updateString("name", "tung"); 
				rs.updateString("tel", "04-12345678");
				rs.insertRow();
			
			}else {
				System.out.println("xx");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
