package helloWorld;

import java.sql.*;

public class AwsRDSConnectionTest {
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://mysql-db1.c5gfxvk6ptv0.us-east-2.rds.amazonaws.com/mysql_db1_master";
	   
	   static final String USER = "mysql_db1_master";
	   static final String PASS = "Tennis100";

	   private Connection connection;
	   
	   public void getConnection() {
		   try {
			   long startTime = System.currentTimeMillis();
			   Class.forName("com.mysql.jdbc.Driver");
			   System.out.println("Starting Connecting to database");
			   
			   connection = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			   System.out.println("Ending Connection to database took: " + (System.currentTimeMillis() - startTime));
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		    
	   }

	
	
}
