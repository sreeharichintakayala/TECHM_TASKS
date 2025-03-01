package com.IO;

import java.io.File;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class IO8 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the file path to retrieve the size of the file in bytes,KB and MB");
		String path = read.next();
		File file = new File(path);
		if(file.exists() && file.isFile()) {
			long fileSizeBytes = file.length();
			double fileSizeKB = fileSizeBytes / 1024.0;
			double fileSizeMB = fileSizeKB / 1024.0;
			System.out.println("In Bytes: " + fileSizeBytes);
			System.out.println("In KB: " + fileSizeKB);
			System.out.println("In MB: "+ fileSizeMB);
		}else {
			System.out.println("Preferred path is to be for a file respectively");
		}
	}
}
