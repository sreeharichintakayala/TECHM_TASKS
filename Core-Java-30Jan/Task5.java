package Training;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args)throws Exception{
		String string;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter string of your choice");
		string = read.next();
		char newStr[] = new char[string.length()];
		for(int i = 0;i < string.length();i++) {
			newStr[i] = string.charAt(i);
		}
		for(int i = 0;i < newStr.length;i+=2) {
			newStr[i] = Character.toUpperCase(newStr[i]);
		}
		for(int i = 0;i < newStr.length;i++) {
			System.out.print(newStr[i]);
		}
	}

}


