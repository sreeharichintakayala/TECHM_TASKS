package com.IO;

import java.io.File;
import java.util.Scanner;

public class IO5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter path");
		String path = read.next();
		File f = new File(path);
		if(f.isDirectory()) {
			System.out.println("Given path resembles Directory");
		}
		else if(f.isFile()) {
			System.out.println("Given path resemebles a file");
		}else {
			System.out.println("Given path does not resembles either a file or directory");
		}
	}
}
