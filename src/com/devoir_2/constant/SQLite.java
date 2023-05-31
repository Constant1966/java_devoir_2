package com.devoir_2.constant;
import java.sql.*;

public class SQLite {
	
	private Connection con() throws SQLException {
		Connection conn = DriverManager.getConnection("jbd");
		return conn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
