package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Johnabraham777#");
			Scanner read = new Scanner(System.in);
			System.out.println("Enter the number of rows you want to insert");
			int totalRows = read.nextInt();
			PreparedStatement ps = connection.prepareStatement("insert into employee values(?,?,?);");
			while(totalRows > 0) {
				System.out.println("Enter id of the employee");
				int id = read.nextInt();
				System.out.println("Enter name of the employee");
				String name = read.next();
				System.out.println("Enter salary of the employee");
				int sal = read.nextInt();
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setInt(3, sal);
				ps.executeUpdate();
				totalRows--;
			}
			ps.close();
			connection.close();
			read.close();
			
			
			
			
			
			
			
		}catch(Exception e) {
			System.err.println(e.getStackTrace());
		}
		
		

	}

}
