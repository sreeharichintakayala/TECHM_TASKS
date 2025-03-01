package com.IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class IO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the path to a folder");
		String path = read.nextLine();
		File file = new File(path);
		System.out.println("Enter the extension");
		String extension = read.next();
		String filesList[] = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				if(name.endsWith(extension)) {
					return true;
				}
				return false;
			}
		});
		for(String n:filesList) {
			System.out.println(n);
		}
	}

}
