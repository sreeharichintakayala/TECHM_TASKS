package Training;

import java.util.Scanner;

public class SpaceCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String string = read.nextLine();
		char arr[] = string.toCharArray();
		int count_spaces = 0,characters_count = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == ' ') {
				count_spaces++;
			}
			else if(Character.isDigit(arr[i])) {
				continue;
			}else {
				characters_count++;
			}
		}
		System.out.println("No of spaces : "+count_spaces+" and characters : " + characters_count);;

	}

}
