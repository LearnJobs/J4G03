package Day_8;

import java.beans.Statement;
import java.io.ObjectInputFilter.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_connection {
	
	
	public Connection conn;
	public java.sql.Statement stmt;
	public ResultSet rs;
	public StringBuffer buf;

	public jdbc_connection() {

		

		try {

		
			Class.forName("com.mysql.cj.jdbc.Driver");
					
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			stmt = conn.createStatement();

			rs = stmt.executeQuery(
					"SELECT p.produ_id, p.produ_name, w.war_name,pr.proce_name FROM product AS p LEFT JOIN warehouse AS w ON p.war_id=w.war_id LEFT JOIN process AS pr ON p.proce_id=pr.proce_id");

			while (rs.next()) {
				buf = new StringBuffer();
				buf.append(padRight(rs.getString("produ_id"), 6) + "  " + padRight(rs.getString("produ_name"), 40)
						+ "  " + padRight(rs.getString("proce_name"), 40) + "  "
						+ padRight(rs.getString("war_name"), 40));
				System.out.println(buf);
			}
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			try {

				conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public String padRight(String data, int length) {
		StringBuffer buf = new StringBuffer(data);
		for (int i = buf.length(); i < length; i++)
			buf.append(" ");
		return buf.toString();
	}

	public static void main(String[] args) {

		new JdbcConnectJavaWithMysql();

	}

}
	
	
	
	
	
	
	
	
	
	


