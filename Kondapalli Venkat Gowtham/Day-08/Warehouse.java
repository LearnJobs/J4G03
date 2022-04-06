package day_08;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Warehouse {
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	public StringBuffer buf;
	
	public Warehouse() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/WAREHOUSE1","root","gowtham123");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from warehouse");
			
			while(rs.next()) {
				buf = new StringBuffer();
				buf.append(rs.getString("warehouse_name"));
				System.out.println(buf);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				conn.close();
			}catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		new Warehouse();

	}

}
