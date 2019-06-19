package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Examplejdbc {

	public static void main(String[] args)
						throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		String sql = "CREATE TABLE TESTING1(SNO NUMBER)";
		stmt.execute(sql);
		System.out.println("done1");
	
		 // TODO Auto-generated method stub
	}

}
