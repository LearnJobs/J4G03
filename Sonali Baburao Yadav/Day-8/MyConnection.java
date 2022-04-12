
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection conn;
	
	static {
		try {
			Class.forName("Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
		} catch(ClassNotFoundException e) {
		} catch(SQLException e) {
		}
	}
	
	public static Connection getConnection() {
		return conn;
	}
}
