package Training;

import java.time.format.FormatStyle;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int numberOfStudents = read.nextInt();
		System.out.println("Enter the number of subjects");
		int numberOfSubjects = read.nextInt();
		int arr[][] = new int[numberOfStudents][numberOfSubjects];
		String names[] = new String[numberOfStudents];
		for(int i = 0;i < numberOfStudents;i++) {		
			names[i] = read.next();
			System.out.println("Enter the marks for student " + names[i]);
			for(int j = 0;j < numberOfSubjects;j++) {
				arr[i][j] = read.nextInt();
			}
		}
		float avgMarks[] = new float[numberOfStudents];
		for(int i = 0;i < numberOfStudents;i++) {
			int sum = 0;
			for(int j = 0;j < numberOfSubjects;j++) {
				sum += arr[i][j];
			}
			avgMarks[i] = (float)sum/numberOfSubjects;
		}
//		for(int i = 0;i< numberOfStudents;i++) {
//			System.out.println("Student "+(i + 1) +" " + avgMarks[i]);
//		}
		for(int i = 0;i < numberOfStudents;i++) {
			for(int j = i + 1;j < numberOfStudents;j++) {
				if(avgMarks[i] < avgMarks[j]) {
					float temp;
					temp = avgMarks[j];
					avgMarks[j] = avgMarks[i];
					avgMarks[i] = temp;
					String temp1;
					temp1 = names[j];
					names[j] = names[i];
					names[i] = temp1;
				}
			}
		}
		System.out.println("Name of the Student" + " "+ "Average" + "Rank");
		for(int i = 0;i < numberOfStudents;i++) {
			System.out.println(names[i] + "           "+ avgMarks[i]+"  "+(i + 1));
		}

	}

}
