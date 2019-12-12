package emailapp;

import java.util.Scanner;

public class Email {

		private String firstName;
		private String lastName;
		private String department;
		private String password;
		private int defaultPasswordLength = 10;
		private String altEmail;
		private int mailboxCapacity = 500;
		private String email;
		private String companySuffix = "company.com";
		
		
	public Email(String firstName,String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);
		
		//Call method to set department
		this.department = setDepartment(); 
		System.out.println("Department: "+ this.department);
		
		//Call method to generate random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is " + this.password);
		
		//Concatenate to generate email.
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase()+"@"+ department + "."+ companySuffix;
		//System.out.println("Your Email is: " + email);
		
				
		}
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\nEnter Department code: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) return "sales";
		else if(depChoice == 2) return "dev";
		else if (depChoice == 3) return "account";
		else return "";
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
			
	}
	public void setmailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	public void setaltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	public int getmailboxCapacity() { return mailboxCapacity; }
	public String getaltEmail() { return altEmail; }
	public String getpassword() { return password; }
	
	public String showInfo() {
		return ("DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb");
		
	}
	
}
