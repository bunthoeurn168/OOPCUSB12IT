package org.school.servletdb.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	// JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL="jdbc:mysql://localhost/servletdb";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";
	public static Connection initializeDatabase() throws ClassNotFoundException, SQLException{
		// Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // Open a connection
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        //System.out.println("connection success");
        return conn;
	}
}
