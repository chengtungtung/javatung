package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthTreeUI;

import tw.org.iii.classes.BCrypt;

public class JDBC08 {

	public static void main(String[] args) {
		// 驗證密碼
		Scanner scanner = new Scanner(System.in);
		System.out.print("Acount = ");
		String account = scanner.next();
		System.out.print("Password = ");
		String passwd = scanner.next();
		
		
		
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);
			
			String sqlLogin = "SELECT * FROM member WHERE account = ?";
			PreparedStatement pstmtLogin = conn.prepareStatement(sqlLogin);
			pstmtLogin.setString(1, account);
			ResultSet rs = pstmtLogin.executeQuery();
			
			if(rs.next()) {
				String hasPasswd = rs.getString("password");
				if(BCrypt.checkpw(passwd, hasPasswd)) {
					System.out.println("Welcome, " + rs.getString("cname"));
				}else {
					System.out.println("ERR2");
				}
				
			
			}else {
				System.out.println("Duplicate");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
