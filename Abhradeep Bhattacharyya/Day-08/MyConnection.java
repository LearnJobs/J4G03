package j4g03.day08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection conn;
	
	static {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Abhra99");
			System.out.println("Connection created");
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public static Connection getConnection() {
		return conn;
	}

	public static void main(String[] args) {
		Connection conn = getConnection();
	}
}