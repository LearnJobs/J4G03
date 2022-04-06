package com.razz1.day8;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCExecutive {
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;

	public JDBCExecutive() {
		try {
			conn = MyConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employ");
		} catch(Exception e) {
		}
	}
	
	public static void main(String[] args) {
		new JDBCExecutive();
	}
}
