package Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
	public static void readFile(String filePath) {
		try {
		File file = new File(filePath);
		Scanner read = new Scanner(file);
		while(read.hasNextLine()) {
			String line = read.nextLine();
			System.out.println(line);
		}
		read.close();
		
		}catch(FileNotFoundException e) {
			System.err.println("FILE WAS NOT FOUND");
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "prime.java";
		readFile(filePath);
	}

}
