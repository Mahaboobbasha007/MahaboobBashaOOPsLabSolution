package com.basha.services;

import java.util.Random;

import com.basha.model.Employee;

public class CredentialServices {

	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "01234566789";
		String specialCharacters = "!@#$%^&*<>=+-_";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	public void showCredentials(Employee employee,String email,char[] generatePassword) {
		
		System.out.println("Dear "+employee.getFirstName()+"your generated credentials are as follows ");
		System.out.println("Email----->" + generateEmailAddress());
		System.out.println("Password-->"+ generatePassword());
		
		

	}

	private String generateEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".abc.com";
		// TODO Auto-generated method stub

	}

}
