package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Johnabraham777#");
			Scanner read = new Scanner(System.in);
			System.out.println("Enter the id of the employee you want to delete");
			int id = read.nextInt();
			PreparedStatement ps = connection.prepareStatement("delete from employee where id = ?");
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Deletion Successfull");
			ps.close();
			connection.close();
			read.close();
			
			
			
			
			
			
			
		}catch(Exception e) {
			System.err.println(e.getStackTrace());
			System.err.println(e.getMessage());
		}

	}

}
