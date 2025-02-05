package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Johnabraham777#");
			Scanner read = new Scanner(System.in);
			boolean st = true;
			while(st) {
				System.out.println("1.INSERT A NEW ROW");
				System.out.println("2.UPDATE A ROW");
				System.out.println("3.DELETE A ROW");
				System.out.println("4.SELECT A ROW");
				System.out.println("5.EXIT");
				switch(read.nextInt()){
				case 1:
					insertTable(connection);
					System.out.println("INSERTION SUCCESSFULL");
					break;
				case 2:
					updateTable(connection);
					break;
				case 3:
					deleteTable(connection);
					break;
				case 4:
					selectTable(connection);
					break;
				case 5:st = false;break;
				default:System.out.println("Enter a valid choice");
				}
			}
			connection.close();
			read.close();
			
			
			
			
			
			
			
		}catch(Exception e) {
			System.err.println(e.getStackTrace());
			System.err.println(e.getMessage());
		}
	}
	static void insertTable(Connection connection) throws SQLException {
		Scanner read = new Scanner(System.in);
		PreparedStatement ps = connection.prepareStatement("insert into employee values(?,?,?);");
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
	}
	static void updateTable(Connection connection)throws SQLException{
		Scanner read = new Scanner(System.in);
		PreparedStatement ps = connection.prepareStatement("update employee set name = ? where id = ?");
		System.out.println("Enter the id of the employee you want to update");
		int id = read.nextInt();
//		System.out.println("Enter the attribute you want to update");
//		String parameter = read.next();
		System.out.println("Enter the value of the attribute");
		String value = read.next();
		ps.setString(1, value);
		ps.setInt(2, id);
		ps.executeUpdate();
	}
	static void deleteTable(Connection connection)throws SQLException{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the id of the employee you want to delete");
		int id = read.nextInt();
		PreparedStatement ps = connection.prepareStatement("delete from employee where id = ?");
		ps.setInt(1, id);
		ps.executeUpdate();
	}
	static void selectTable(Connection connection)throws SQLException{
		Scanner read = new Scanner(System.in);
		Statement stmt = connection.createStatement();
	    //store the results to the container
	    ResultSet rs = stmt.executeQuery("select * from employee");
	    
	    //iterate the container to extract all the row/s
	    //iterate 
		while(rs.next()){
		System.out.println("ID: " + rs.getInt(1));
		System.out.println("NAME: "+rs.getString(2));
		System.out.println("SALARY: " +rs.getInt(3));
		System.out.println("========================");
		}// while()
		
	}

}
