package Training;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		String num = read.next();
		StringBuffer sb = new StringBuffer(num);
		System.out.println(sb.reverse());

	}

}
