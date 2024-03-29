package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1 - Load the JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		// Step 2 - Connection
		String url = "jdbc:mysql://localhost:3306/management";
		String username = "root";
		String password = "root";
				
		// Step 3 - Call DriverManager class
		Connection conn = DriverManager.getConnection(url, username, password); 	// Establish connection with the database
				
		// The object used for executing a static SQL statements
		Statement stmt = conn.createStatement();		// statement help me to execute the SQL query
		
		System.out.println("Inserting data into table...");
		String insertQuery = "INSERT INTO employee VALUES (108, 'Atul', 22);";
		stmt.execute(insertQuery);
		System.out.println("Data inserted successfully");
		
		System.out.println("Updating data...");
		String updateQuery = "UPDATE employee SET name='Shreyash' WHERE id=104;";
		stmt.execute(updateQuery);
		System.out.println("Update successfull");
		
		System.out.println("Deleting data...");
		String deleteQuery = "DELETE FROM employee WHERE id = 105;";
		stmt.execute(deleteQuery);
		System.out.println("Seletion Successfull");
		
		System.out.println("Collect data from employee table.");
		String query = "SELECT * FROM employee";
				
		// A table of data representing a database result set, which is 
		// usually generated by executing a statement that queries the database. 
		ResultSet rs = stmt.executeQuery(query);		// Using ResultSet we can read data from table
				
		while(rs.next()) {
			int empId = rs.getInt("id");
			String empName = rs.getString("name");
			int empAge = rs.getInt("age");
					
			System.out.println(empId + "\t" + empName + "\t" + empAge);
		}

	}

}
