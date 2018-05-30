package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private String mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String campany = "osmcompany.com";
	
	// Constructor to receive the first name and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println ("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		
		this.department = this.SetDepartment();
		System.out.println("Department: "+this.department);
		
		this.password = this.randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//combien elements to generate email
		email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+
				this.campany;
		System.out.println("Your email is: "+email);
	}
	// Ask for the department 
	private String SetDepartment() {
		System.out.print("DEPARTMENT CODES\n1"
				+ " for Sales\n2"
				+ " for Development\n3"
				+ " for Accounting\n0 "
				+ "for none\n"
				+ "Enter department code:");
		Scanner in = new Scanner(System.in); 
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "devlopment";}
		else if (depChoice == 3) {return "accounting";}
		else {return "";}
	}
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#%";
		char[] password = new char[length];
		for(int i=0 ; i< length ; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	// Set the mailbox capacity
	
	// Set the alternat email 
	
	// Change the password 
	
	// Section 2, session 10
	
}
