package DAY9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlStatment {
	String statement;
	String father;
	String gender;
	String qualification;
	String country;
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	public ResultSetMetaData rsmd;

	BufferedReader br;
	BufferedWriter bw;
	String str = "select * from warehouse"; 

	public SqlStatment() {
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("personl-data.csv")));
			String more = "y";
			StringBuffer buf;

			while(more.equalsIgnoreCase("y")) {
				buf = new StringBuffer();

				System.out.print(padLeft("Enter the SQL Statement: ",25));
		
				String statement = br.readLine();
				buf.append(statement+", ");
	
				bw.write(buf.toString()+"\r\n");

				System.out.println();
				
				more = br.readLine();
				if(str.contains("select * from warehouse")) {
					System.out.println("Warehouse data will be printed when you press enter :");
				}
				else{
					System.out.println("Please enter the valid statement :");
				}
			}
		} catch(IOException e) {
		} catch(Exception e) {
		} finally {
			try {
				bw.close();
				br.close();
			} catch(IOException f) {
			}
		}
	
	
	
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehousee","root","7799242481");
	stmt = conn.createStatement();
	rs = stmt.executeQuery("SELECT * from warehouse");
	rsmd = rs.getMetaData();

	// Line
	int length;
	System.out.print("\r\n+-");
	for(int i=1; i<=rsmd.getColumnCount(); i++) {
		length = (rsmd.getColumnName(i).length()>rsmd.getColumnDisplaySize(i)?rsmd.getColumnDisplaySize(i):50);
		System.out.print(replicate("-",length)+"-+-");
	}
	
	// Header
	System.out.print("\r\n| ");
	for(int i=1; i<=rsmd.getColumnCount(); i++) {
		length = (rsmd.getColumnLabel(i).length()>rsmd.getColumnDisplaySize(i)?rsmd.getColumnDisplaySize(i):50);
		System.out.print(padCenter(rsmd.getColumnLabel(i).toUpperCase(),length)+" | ");
	}

	// Line
	System.out.print("\r\n+-");
	for(int i=1; i<=rsmd.getColumnCount(); i++) {
		length = (rsmd.getColumnLabel(i).length()>rsmd.getColumnDisplaySize(i)?rsmd.getColumnDisplaySize(i):50);
		System.out.print(replicate("-",length)+"-+-");
	}

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

	// Line
	System.out.print("\r\n+-");
	for(int i=1; i<=rsmd.getColumnCount(); i++) {
		length = (rsmd.getColumnName(i).length()>rsmd.getColumnDisplaySize(i)?rsmd.getColumnDisplaySize(i):50);
		System.out.print(replicate("-",length)+"-+-");
	}
} catch(ClassNotFoundException e) {
} catch(SQLException e) {
} catch(Exception e) {
} finally {
	try {
		conn.close();
		stmt.close();
		rs.close();
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

public String replicate(String data, int length) {
StringBuffer buf = new StringBuffer();
for(int i=0; i<length; i++) buf.append(data);
return buf.toString();
}
	public static void main(String[] args) {
		new SqlStatment();
	}

}
