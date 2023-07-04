package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBC06 {

	public static void main(String[] args) {
		// 分頁資料

		// 使用者輸入
		Scanner scanner = new Scanner(System.in);
		System.out.print("Page = ");
		int page = scanner.nextInt();

		int rpp = 10; // row per page // 每頁要顯示幾筆資料
		int start = (page - 1) * rpp; // 從第幾頁開始

		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);
			Statement stmt = conn.createStatement();
			ResultSet rsTotal = stmt.executeQuery("SELECT count(*) total FROM foods");
			rsTotal.next();
			int total = rsTotal.getInt("total");
			int pages = (int) Math.ceil(total * 1.0 / rpp); // 139*1.0變成13.9，用Math.ceil取14

			if (page <= 0 || page > pages)
				throw new Exception("沒有此頁");

			String sql = "SELECT * FROM foods LIMIT ? , ? "; // 第一個數字代表sql的起始數字(從0開始)，第二個數字代表取幾筆資料
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, rpp);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");

				System.out.println(String.format("%s : %s", id, name));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
