import java.sql.*;
public class insert {

	public static void main(String args[])
	{  
		try{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","username","password");  
		
		  
		//step3 create the statement object  
		Statement stmt=con.createStatement(); 
	
		
        String sql = "INSERT INTO student11 VALUES (10, 'Zara')";
        stmt.executeUpdate(sql);
		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from student11");  
		
		while(rs.next()) 
		{
				
		System.out.println(rs.getInt(1)+""+rs.getString(2));  
		} 
		//step5 close the connection object  
		con.close();  
		  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}    
		} 
}