package Training;

import java.util.Scanner;

public class Perfect {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		double num = read.nextDouble();
		double num1 = Math.sqrt(num);
		if(num1 * num1 == num) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
