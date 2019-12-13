package studentdatabaseapp;


import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String uniqueID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int fees = 600;
	private static int id = 1000;
	
	
	//constructor prompt user for student name and year. 
	
	public Student() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student first name: ");
		this.firstName = sc.nextLine();
		System.out.print("Enter Student last name: ");
		this.lastName = sc.nextLine();
		System.out.print("Enter Student grade: \n1 for Freshmen \n2 for sophmore \n3 for Junior \n4 for Senior \n=");
		this.gradeYear = sc.nextInt();
		setUniqueID();
		System.out.println(firstName +" "+ lastName +" "+ gradeYear +" "+uniqueID);
		
		}
	
	
	//generate unique id
	
	private void setUniqueID() {
		id++;
		this.uniqueID =  gradeYear + "" + id;
	}
	
	//enroll in courses
	public void enroll() {
		do {
		System.out.print("Enter course to enroll, (Enter Q to quit): ");
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine().toUpperCase();
		if(!course.equals("Q")) {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + fees;
		}
		else break;
		}while (1 != 0);
		
		System.out.println("ENROLLED IN: " + courses);
		
	}
	
	//view balance 
	public void viewBalance() {
		System.out.println("Your balance is : $" + tuitionBalance);
	}
	
	//pay tutition
	public void payTuition() {
		System.out.println("Enter you payment amount: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//print info
	
	
}
