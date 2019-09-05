package day8;

import java.sql.*;
import java.util.Scanner;

public class CrudOperations {

	public static void main(String[] args) throws Exception{
		
				Scanner sc = new Scanner(System.in);
				//step2: load and register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//step3: establish the connection
				String url = "jdbc:mysql://localhost:3306/db";
				String username = "root";
				String password = "test";
				String query = "";
				
				Connection con = DriverManager.getConnection(url,username,password);
				
				int ch=0,i=0,rollno;
				String name = "";
				
				do {
					
					System.out.println("-------------Operations on database---------------");
					System.out.println("1. create a record in a table");
					System.out.println("2. read all records in table");
					System.out.println("3. update name of a student in table");
					System.out.println("4. delete a record in table");
					System.out.println("5. exit");
					
					ch = sc.nextInt();
					
					switch(ch) {
					
					case 1: 
							System.out.println("Enter roll no:");
							rollno = sc.nextInt();
							System.out.println("Enter Name:");
							name = sc.next();
							
							query = "insert into student values(?,?)";
							PreparedStatement ps = con.prepareStatement(query);
							ps.setInt(1, rollno);
							ps.setString(2, name);
							
							i=ps.executeUpdate();  
							System.out.println(i+" records inserted"); 
							
							ps.close();
							
							break;
							
					case 2:
							query = "select * from student";
							Statement st = con.createStatement();
							
							ResultSet rs = st.executeQuery(query);
							while(rs.next()) {
								System.out.println(rs.getInt("rollno")+" "+rs.getString("name"));
							}
							
							st.close();
							
							break;
							
					case 3:
							System.out.println("Enter roll no:");
							rollno = sc.nextInt();
							System.out.println("Enter correct name:");
							name = sc.next();
							
							query = "update student set name = ? where rollno = ?";
							PreparedStatement p = con.prepareStatement(query);
							
							p.setString(1, name);
							p.setInt(2, rollno);
							
							i = p.executeUpdate();
							System.out.println(i+" records updated"); 
							
							p.close();
							
							break;
							
					case 4:
							System.out.println("Enter roll no:");
							
							query = "delete from student where rollno = ?";
							PreparedStatement p1 = con.prepareStatement(query);
							p1.setInt(1, sc.nextInt());
							
							i = p1.executeUpdate();
							System.out.println(i+" records deleted");
							
							p1.close();
							
							break;
							
					default : break;
					
					}
					
					
				}while(ch<5);
				
				sc.close();
				con.close();

	}

}
