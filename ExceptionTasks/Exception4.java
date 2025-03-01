package Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException extends Exception{

	public PositiveNumberException(String message) {
		super(message);
	}
}

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "//src//Training//content.txt";
		try {
			readNumbers(filePath);
		}
		catch(FileNotFoundException e) {
			System.err.println("FILE NOT FOUND");
		}
		catch (PositiveNumberException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}

	}
	public static void readNumbers(String filePath)throws FileNotFoundException,PositiveNumberException{
		File file = new File(filePath);
		Scanner read = new Scanner(file);
		while(read.hasNextLine()) {
			String line = read.nextLine().trim();
			if(!line.isEmpty()) {
				try {
					int number = Integer.parseInt(line);
					if(number > 0) {
						throw new PositiveNumberException("Positive Number Found: " + number);
					}
					System.out.println("Valid Number: " + number);
				}catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("Invalid Number Format: "+line);
				}
			}
		}
		read.close();
	}

}
