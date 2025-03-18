package Training;

import java.util.Scanner;
import java.util.StringTokenizer;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String s = read.nextLine();
		s = s.substring(0, s.length()-1);
		StringTokenizer st = new StringTokenizer(s," ");
		int count = 0;
		count = st.countTokens();
		int arr[] = new int[count];
		int k = 0;
		while(st.hasMoreTokens()) {
			arr[k++] = Integer.parseInt(st.nextToken());
		}
//		for(int j = 0;j < arr.length;j++) {
//			System.out.println(arr[j]);
//		}
		int ans[] = findPrimeNumbers(arr);
		for(int i = 0;i < ans.length;i++) {
			for(int j = i + 1;j < ans.length;j++) {
				if(ans[i] < ans[j]) {
					int temp = ans[i];
					ans[i] = ans[j];
					ans[j] = temp;
				}
			}
		}
		System.out.println(ans[1] + ans.length);

	}
	public static int[] findPrimeNumbers(int arr[]) {
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			if(isPrime(arr[i])) {
				count++;
			}
		}
		int res[] = new int[count];
		int j = 0;
		for(int i = 0;i < arr.length;i++) {
			if(isPrime(arr[i])) {
				res[j++] = arr[i];
			}
		}
		return res;
	}
	public static boolean isPrime(int num) {
		int count = 0;
		for(int i = 1;i <= num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
	}

}
