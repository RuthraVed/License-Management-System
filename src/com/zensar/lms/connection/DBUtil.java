package com.zensar.lms.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {
	static Connection con =null;
	public static Connection getMyConnection() throws SQLException
	{	
		
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/testDB");
			con = ds.getConnection();

		} catch (Exception e) {
			System.out.println("In DBUtil..."+e);
		}
		return con;


	}
}
