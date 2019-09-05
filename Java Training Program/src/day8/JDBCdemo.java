package day8;

//step1: import the package
import java.sql.*;

public class JDBCdemo {

	public static void main(String[] args) throws Exception{
		
		//step2: load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step3: establish the connection
		String url = "jdbc:mysql://localhost:3306/db";
		String username = "root";
		String password = "test";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		//step4: create SQL statement
		Statement st = con.createStatement();
		
		//step5: execute the query
		ResultSet rs = st.executeQuery("select * from student");
		
		//step6: process the result
		while(rs.next()) {
			String name=rs.getString("Name");
			System.out.println(name);
		}
		
		//step7: close connection
		st.close();
		con.close();
		
	}

}
