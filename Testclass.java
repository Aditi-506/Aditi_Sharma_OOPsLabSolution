package com.GreatLearningLab.Test;
import java.util.Scanner;
import com.GreatLearningLab.Employee.*;
import com.GreatLearningLab.CredentialService.*;

public class Testclass {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter the department \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		
		int i= s.nextInt();
		String dept = null;
		String Company = "Greatlearning";
		if(i==1) {
		dept="Technical";
		}else if (i==2) { 
			dept="Admin";
		}else if (i==3) { 
			dept="HR";
		}else if (i==4) { 
			dept="Legal";
		}else {
			System.out.println("Invalid Choice. Please select from options provided\n");
		}
		
		Employee e = new Employee ("Aditi", "Sharma");
		CredentialService cs = new CredentialService();
		String q = cs.generateEmailAddress(e,dept,Company); 
		char[] p= cs.generatePassword(i);
		cs.showCredentials(e,q,p);
				
		
	}
}
