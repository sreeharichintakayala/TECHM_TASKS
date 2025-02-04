package Training;

import java.util.Scanner;

class OddNumberException extends Exception{
	public OddNumberException(String message) {
		super(message);
	}
}
public class Exception2 {
	public static void checkNum(int num)throws OddNumberException {
		if(num%2 == 0) {
			System.out.println("The number is even " + num);
		}else {
			throw new OddNumberException("The number is odd " + num);
		}
	}

public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = read.nextInt();
	try {
		checkNum(num);
	}catch(OddNumberException e) {
		System.err.println(e.getMessage());
	}finally {
		read.close();
	}
}
} 