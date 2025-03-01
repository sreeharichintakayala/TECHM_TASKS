package com.IO;

import java.io.File;
import java.util.Scanner;

public class IO3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the preferred directory path");
		String directoryPath = read.next();
		File directory = new File(directoryPath);
		if(directory.exists()) {
			System.out.println("DIRECTORY EXISTS");
			
		}
		else {
			System.out.println("DIRECTORY DO NOT EXIST");
		}
	}
}
