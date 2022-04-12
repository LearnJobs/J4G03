import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Meta_data {
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	public ResultSetMetaData rsmd;
	private int i;
	private Object data;
	private int length;
	public Meta_data() {
	try {
		Class.forName("Driver");
		stmt=(Statement) conn.createStatement();
		conn=DriverManager.getConnection("SELECT e.employ_id,INITCAP(e.employee_name) AS employ_name, des.desig_desc, dep.depart_name From employ AS e LEFT JOIN designation AS des ON e.desig_id=des.desig_id LEFT JOIN deprtment AS dep ON e.depart_id=dep.depart_id");
		rsmd=rs.getMetaData();
		int length;
		System.out.println("\r\n+-");
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			length=(rsmd.getColumnName(i).length()>rsmd.getColumnDisplaySize(i)?rsmd.getColumnDisplaySize(i):50);
			System.out.println(replicate("-",length)+"-+-");
			System.out.println("\r\n|");
		}
		
		
		System.out.println("\r\n+-");
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			length=(rsmd.getColumnLabel(i).length()>rsmd.getColumnDisplaySize(i)?rsmd.getColumnDisplaySize(i):50);
			System.out.println(padCenter(rsmd.getColumnLabel(i).toUpperCase(),length)+"|");
	}
		
		System.out.println("\r\n+-");
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			length=(rsmd.getColumnLabel(i).length()>rsmd.getColumnDisplaySize(i)?rsmd.getColumnDisplaySize(i):50);
			System.out.println(replicate("-",length)+"-+-");
		}
		String type;
		while(rs.next()) {
			System.out.print("|");
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				type=rsmd.getColumnTypeName(i);
				if(type.equalsIgnoreCase("CHAR")) {
					System.out.printf(padRight(rs.getString(i)),(rsmd.getColumnDisplaySize(i)<=50?rsmd.getColumnClassName(i).length():50)+"|");}
				else if (type.equalsIgnoreCase("VARCHAR")) {
					 System.out.printf(padRight(rs.getString(i)),(rsmd.getColumnDisplaySize(i)<=50?rsmd.getColumnClassName(i).length():50)+"|");}
			else if(type.equalsIgnoreCase("INT")) {
				System.out.printf(padRight(rs.getString(i)),(rsmd.getColumnDisplaySize(i)<=50?rsmd.getColumnClassName(i).length():50)+"|");}
			}
			System.out.println();
		}
		System.out.println("\r\n+-");
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			length=(rsmd.getColumnName(i).length()>rsmd.getColumnDisplaySize(i)?rsmd.getColumnDisplaySize(i):50);
			System.out.println(replicate("-",length)+"-+-");}
	}catch(ClassNotFoundException e) {
	}catch(SQLException e) {
	}catch(Exception e) {
	}finally {
		try {
			conn.close();
		}
		catch(SQLException e) {
			
		}
	}
	}
	

	private String padCenter(String upperCase, int length) {
		// TODO Auto-generated method stub
		return null;
	}


	private String padRight(String data) {
		StringBuffer buf=new StringBuffer(data);
		for(int i=buf.length();i<length;i++);{
			if (i%2==0) buf.insert(0, " ");
			else buf.append(" ");
		}
		return buf.toString();
	}

	private String padRight1(String data, int length) {
		StringBuffer buf=new StringBuffer(data);
		for(int i=buf.length();i<length;i++) buf.append(" ");
		return buf.toString();}


	private String replicate(String string, int length) {
		StringBuffer buf =new StringBuffer();
		for(int i=0;i<length;i++)buf.append(data);
		return buf.toString();}



	public static void main(String[] args) {
	}

}
