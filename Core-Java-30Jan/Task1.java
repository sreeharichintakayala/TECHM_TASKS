package Training;

import java.util.Scanner;

public class Task1 {
	public static void main(String args[])throws Exception{
		System.out.println("Enter the size of an array");
		Scanner read = new Scanner(System.in);
		int len = read.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the array elements");
		for(int i = 0;i < len;i++) {
			arr[i] = read.nextInt();
		}
		int arr1[] = new int[len];
		int j = 0;
		for(int i = 0;i < len;i += 2) {
			System.arraycopy(arr, i, arr1, j++, 1);
		}
		System.out.println("The array elements are ");
		for(int i = 0;i < j;i++) {
			System.out.println(arr1[i]);
		}
	}
}
