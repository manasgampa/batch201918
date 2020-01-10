package com.antra1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx1 {

	public static void main(String[] args) throws SQLException {
		
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
		pstmt.setInt(1, 2);
		pstmt.setString(2, "Jie");
		pstmt.setInt(3, 456);
		pstmt.execute();
		con.close();
		
		
		
		/*//Driver d=new com.mysql.jdbc.Driver();
		//Driver d=new oracle.jdbc.driver.OracleDriver();
		//System.out.println(d);
		//DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		Statement stmt=con.createStatement();
		//stmt.executeUpdate("insert into emp values(1,'Qihao',734)");
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			
		}
		
		
		con.close();*/
	}
	
}
