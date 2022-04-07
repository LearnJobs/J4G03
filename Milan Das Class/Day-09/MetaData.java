package j4g03.day09;

/*
 * Object: Demonstrate meta-data
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaData {
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	public ResultSetMetaData rsmd;
	
	public MetaData() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT e.employ_id, INITCAP(e.employ_name) AS employ_name, des.desig_desc, dep.depart_name FROM employ AS e LEFT JOIN designation AS des ON e.desig_id=des.desig_id LEFT JOIN department AS dep ON e.depart_id=dep.depart_id");
			rsmd = rs.getMetaData();
			
			// Header
			System.out.print("\r\n| ");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(padCenter(rsmd.getColumnLabel(i).toUpperCase(),(rsmd.getColumnName(i).length()>rsmd.getColumnDisplaySize(i)?rsmd.getColumnDisplaySize(i):50))+" | ");
			}
			System.out.println();

			// Data
			String type;
			while(rs.next()) {
				System.out.print("| ");
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					type = rsmd.getColumnTypeName(i);
					//System.out.println(type);
					if(type.equalsIgnoreCase("CHAR")) {
						System.out.print(padRight(rs.getString(i), (rsmd.getColumnDisplaySize(i)<=50)?rsmd.getColumnName(i).length():50)+" | ");
					} else if(type.equalsIgnoreCase("VARCHAR")) {
							System.out.print(padRight(rs.getString(i), (rsmd.getColumnDisplaySize(i)<=50)?rsmd.getColumnName(i).length():50)+" | ");
					} else if(type.equalsIgnoreCase("INT")) {
						System.out.print(padLeft(rs.getString(i), (rsmd.getColumnDisplaySize(i)<=50)?rsmd.getColumnName(i).length():50)+" | ");
					}
				}
				System.out.println();
			}

		} catch(ClassNotFoundException e) {
		} catch(SQLException e) {
		} catch(Exception e) {
		} finally {
			try {
				conn.close();
			} catch(SQLException e) {
			}
		}
	}

	public String padCenter(String data, int length) {
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<length; i++) {
			if(i%2==0) buf.insert(0, " ");
			else       buf.append(" ");
		}
		return buf.toString();
	}

	public String padLeft(String data, int length) {
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<length; i++) buf.insert(0, " ");
		return buf.toString();
	}

	public String padRight(String data, int length) {
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<length; i++) buf.append(" ");
		return buf.toString();
	}
	
	public static void main(String[] args) {
		new MetaData();
	}

}
