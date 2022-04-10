package DAY9;

import java.sql.*;

public class Warehouse {
		
		public Connection  con;
		public Statement stmt;
		public ResultSet rs;
		public StringBuffer buf; 
	    Warehouse()
		{
	    		try {
	    			Class.forName("com.mysql.cj.jdbc.Driver");
	    		//	System.out.println("Driver Loaded");

	    			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/warehousee","root","7799242481");
	    		//	System.out.println("Connection created");
	    	    	
	    			stmt=con.createStatement();
	    		//	System.out.println("Statement Created");
	    	    	
	    			rs=stmt.executeQuery("Select * from product_warehouse_process");
	    		//	System.out.println("Result set ");
	    	    			
	    			while(rs.next()) 
	    			{
	    				buf=new StringBuffer();
	    				buf.append((padRight(rs.getString("prod_id"),3))+"       "+
	    								   (padRight(rs.getString("prod_name"),30))+"        "+
	    								   (padRight(rs.getString("warehouse_name"),20))+"        "+
	    							       (padRight(rs.getString("process_name"),30)));
	    					System.out.println(buf);
	    					
	    			}
	    			con.close();
	    			stmt.close();
	    			rs.close();
	    	
	    		}
	    		catch(Exception e)
	    		{
	    			System.out.println("Exception "+e);
	    		}
			
		}
		
	    public String padRight(String data,int length ) {
			StringBuffer buf  = new StringBuffer(data);
			for(int i=buf.length();i<length;i++)
				buf.append(" ");
			
			return buf.toString();
		}
	    public static void main (String[ ] args)
	    {
	    	new Warehouse();
	    	
	    }

}