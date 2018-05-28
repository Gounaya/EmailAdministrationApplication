package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String mailboxCapacity;
	private String alternateEmail;
	
	
	// Constructor to receive the first name and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println ("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		
	}
	// Ask for the department 
	private String SetDepartment() {
		System.out.print("Enter the department\n1"
				+ " for Sales\n2"
				+ " for Development\n3"
				+ " for Accounting\n0 for none");
		Scanner in = new Scanner(System.in); 
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "";}
	}
	// Generate a random password
	
	// Set the mailbox capacity
	
	// Set the alternat email 
	
	// Change the password 
	
	
}
