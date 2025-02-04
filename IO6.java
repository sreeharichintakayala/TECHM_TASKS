package com.IO;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class IO6 {
	public static void main(String[] arg) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the file path");
		String Path  = read.next();
		File f = new File(Path);
		System.out.println(f.lastModified());
//		f.getS
	}
}
