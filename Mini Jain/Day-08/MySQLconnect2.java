package day8.java;

public class MySQLconnect2 {
	import java.sql.*;

	public class MySQLConnect2 {
		public Connection conn;
		public PreparedStatement pstmt;
		public ResultSet rs;
		public StringBuffer buf;

		public MySQLConnect2() {
			try {
				// Step-2: Load and register the driver
				Class.forName("org.gjt.mm.mysql.Driver");

				// Step-3: Create a Connection object
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","");

				// Step-4: Create Statement object
				pstmt = conn.prepareStatement("select p.product_id,p.product_name,p.expiry_date,w.warehouse_name,pr.process_name from product as p left join warehouse as w on p.warehouse_id=w.warehouse_id left join process as pr on p.process_id=pr.process_id WHERE p.warehouse_id=? AND p.process_id=?");
				pstmt.setInt(1, 1);
				pstmt.setInt(2, 3);

				// Step-5: Obtain ResultSet object
				rs = pstmt.executeQuery();

				// Step-6: Manipulate the ResultSet
				while(rs.next()) {
					buf = new StringBuffer();
					buf.append(padRight(rs.getString("product_id"), 3)+"  "+
				               padRight(rs.getString("product_name"), 40)+"  "+
							   padRight(rs.getString("expiry_date"), 40)+"  "+
							   padRight(rs.getString("Warehouse_name"), 40)+"  "+
				               padRight(rs.getString("Process_name"), 40));
					System.out.println(buf);
				}
			} catch(ClassNotFoundException e) {
				System.err.println(e);
			} catch(SQLException e) {
				System.err.println(e);
			} finally {
				try {
					// Step-7: Close ResultSet, Statement and Connection
					conn.close();
				} catch(SQLException e) {
				}
			}
		}

		public String padRight(String data, int length) {
			StringBuffer buf = new StringBuffer(data);
			for(int i=buf.length(); i<length; i++) buf.append(" ");
			return buf.toString();
		}

		public static void main(String[] args) {
			new MySQLConnect2();
		}
	}	
	