package com.basha.driver;

import java.util.Scanner;

import com.basha.model.Employee;
import com.basha.services.CredentialServices;

public class Main {
	public static void main(String args[]) {
		CredentialServices cs=new CredentialServices();
		
		
		Employee employee = new Employee("mahaboob", "basha");
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical\n 2.Admin \n 3.Human Resources \n 4.legal");
		System.out.println("Choose your option");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		String deaprtment;
		String emailAddress;
		char[] generatePassword;
		String showCredentials;
		switch (option) {
		case 1:
			emailAddress=cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"tech");
			 System.out.println(emailAddress);
			 generatePassword=cs.generatePassword();
			System.out.println(generatePassword);
			
			break;
		case 2:
			emailAddress=cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"admin");
			System.out.println(emailAddress);
			 generatePassword=cs.generatePassword();
		 System.out.println(generatePassword);
			
			break;
		case 3:
			emailAddress=cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"hr");
			System.out.println(emailAddress);
			 generatePassword=cs.generatePassword();
			 System.out.println(generatePassword);
			
			break;
		case 4:
			emailAddress=cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"legal");
			System.out.println(emailAddress);
			 generatePassword=cs.generatePassword();
			 System.out.println(generatePassword);
			
			break;
		default:
			System.out.println("Please choose the valid option");
		}

	}

	
	

	
	}

