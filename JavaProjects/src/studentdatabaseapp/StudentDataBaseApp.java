package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {

	public static void main(String[] args) {
		
		// ask how many users they want to add.
		
		System.out.print("Enter number of new students you would like to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student[] students = new Student[numOfStudents];
				
		//create n number of students
		for (int n=0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			
			
		}
		for(Student stu : students) {
			System.out.println(stu.toString());
			System.out.println();
		}
	}

}
