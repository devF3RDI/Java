package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String uniqueID;
	private String courses;
	private int tuitionBalance;
	private static int fees = 600;
	private static int id = 1000;
	
	
	//constructor prompt user for student name and year. 
	
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student first name: ");
		this.firstName = in.nextLine();
		System.out.print("Enter Student last name: ");
		this.lastName = in.nextLine();
		System.out.print("Enter Student grade: \n1 for Freshmen \n2 for sophmore \n3 for Junior \n4 for Senior \n=");
		this.gradeYear = in.nextInt();
		setUniqueID();
		System.out.println(firstName +" "+ lastName +" "+ gradeYear +" "+uniqueID);
		
		
		
		}
	
	//generate unique id
	
	private void setUniqueID() {
		id++;
		this.uniqueID =  gradeYear + "" + id;
	}
	
	//enroll in courses
	
	//view balance 
	
	//pay tutition
	
	//print info
	
	
}
