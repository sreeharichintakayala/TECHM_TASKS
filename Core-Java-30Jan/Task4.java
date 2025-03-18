package Training;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,32,21};
		int arr1[] = Arrays.copyOfRange(arr, 0, 3+3);
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
