package com.sql;
import java.sql.*;
import java.util.Scanner;
public class JDBC2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Johnabraham777#");
			Scanner read = new Scanner(System.in);
			System.out.println("Enter the id of the employee you want to update");
			int id = read.nextInt();
//			System.out.println("Enter the attribute you want to update");
//			String parameter = read.next();
			System.out.println("Enter the value of the attribute");
			String value = read.next();
			PreparedStatement ps = connection.prepareStatement("update employee set name=? where id=?");
//			ps.setString(1, parameter);
			ps.setString(1, value);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("Update Successfull");
			ps.close();
			connection.close();
			read.close();
			
			
			
			
			
			
			
		}catch(Exception e) {
			System.err.println(e.getStackTrace());
			System.err.println(e.getMessage());
		}
		
	}
}
