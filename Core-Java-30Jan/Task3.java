package Training;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		Object arr11[] = {3,2,1};
		Object arr22[] = {3,2,1};
		System.out.println(arr1.equals(arr2));
		System.out.println(Arrays.deepEquals(arr11, arr22));
	}

}
