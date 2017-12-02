package PasswordprotectedPhnServics;

import java.util.Scanner;

public  class ObjectClassPasswordPhnServic {
	{
		System.out.println("what kond of Servic Do you want?");
	}
	
	static Scanner ObjectclassScnr=new Scanner(System.in);
	
	
void PhoneService(){
	System.out.print("National or International call? ");
	String phnCalltype=ObjectclassScnr.nextLine();
	if (phnCalltype.toLowerCase().equals("national")) {
		System.out.println("You Chose a National Phone call Servic !");
		
	} else if (phnCalltype.toLowerCase().equals("international")) {
		System.out.println("You want to Make a International Call !");
		
	}else {
		System.out.println("=============== NO SERVICE ==================");

	}
	
		
}



	
	
	
	void MobileServic(){
		System.out.print("Multimedia phone or General Phone? ");
		String MobileType=ObjectclassScnr.nextLine();
		if (MobileType.toLowerCase().equals("general")) {
			System.out.println("You Choise a General type of phone !");
			
		}else if (MobileType.toLowerCase().equals("multimedia")) {
			System.out.println("You Choise a Multimedia phone !");
			
		}else {
			System.out.println("=============== NO SERVICE ==================");

		}
		
	}
		

		
	
	
	

	
}
