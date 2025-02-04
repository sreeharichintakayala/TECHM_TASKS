package com.IO;

import java.io.File;

public class IO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users");
		String files[] = f.list();
		for(String name:files) {
			System.out.println(name);
		}
	}

}
