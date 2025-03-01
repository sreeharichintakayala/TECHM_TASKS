package com.IO;

import java.io.File;
import java.util.Scanner;

public class IO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the folder path");
		String path = read.next();
		File f = new File(path);
		if(f.canRead()) {
			System.out.println("The files " + f.getAbsolutePath()+" can read the contents");
			
		}else {
			System.out.println("The files " + f.getAbsolutePath()+ " cannot read contents");
		}
		if(f.canWrite()) {
			System.out.println("The files "+ f.getAbsolutePath()+ " can write the contents");
		}else {
			System.out.println("The files "+ f.getAbsolutePath()+"cannot write contents");
		}
	}

}
