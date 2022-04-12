import java.sql.*;
public class My_connector2 {

		public Connection conn;
		public PreparedStatement pstmt;
		public ResultSet rs;
		public StringBuffer buf;

		public My_connector2() {
			try {
				Class.forName("Driver");

				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");

				pstmt = conn.prepareStatement("SELECT e.employ_id, e.employ_name, des.desig_desc, dep.depart_name FROM employ AS e LEFT JOIN designation AS des ON e.desig_id=des.desig_id LEFT JOIN department AS dep ON e.depart_id=dep.depart_id WHERE e.depart_id=? AND e.desig_id=?");
				pstmt.setInt(1, 1);
				pstmt.setInt(2, 3);

				rs = pstmt.executeQuery();
				while(rs.next()) {
					buf = new StringBuffer();
					buf.append(padRight(rs.getString("employ_id"), 3)+"  "+
				               padRight(rs.getString("employ_name"), 40)+"  "+
							   padRight(rs.getString("desig_desc"), 40)+"  "+
				               padRight(rs.getString("depart_name"), 40));
					System.out.println(buf);
				}
			} catch(ClassNotFoundException e) {
				System.err.println(e);
			} catch(SQLException e) {
				System.err.println(e);
			} finally {
				try {
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
			new My_connector2();
		}
}
