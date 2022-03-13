package com.GreatLearningLab.CredentialService;
import java.util.Random;
import com.GreatLearningLab.Employee.*;
public class CredentialService {

	public char[] generatePassword(int length){
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialcharacters = "!@#$%^&*";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialcharacters + numbers;
		Random random = new Random();
		char[] password = new char[8];
		
		for (int i=0; i<8; i++) {
		
		password [i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
	return password;
	}
	
	public String generateEmailAddress(Employee e, String f, String c) {
		return e.getFirstName() + e.getLastName() + "@" + f + "." + c + ".com" ;
	
	}
	
	
	public void showCredentials(Employee employee, String email, char[] password ) 
	{
		System.out.println("\nDear " + employee.getFirstName() + " " + employee.getLastName() + " your generated credentials are as follows: ");
		System.out.println("\nEmail: " + email);
		System.out.println("\nPassword: " + String.valueOf(password));
	}
}
