package Training;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String string = read.next();
		string = string.toLowerCase();
		StringBuffer sBuffer = new StringBuffer(string);
		System.out.println(sBuffer.reverse());

	}

}
