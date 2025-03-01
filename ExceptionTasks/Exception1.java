package Training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner read = new Scanner(System.in);
			int num = read.nextInt();
			System.out.println("The number which has read is " + num);
			
		}
		catch (InputMismatchException  e) {
			// TODO: handle exception
			System.err.println("REQUIRED ONLY INTEGER TYPE");
		}

	}

}
