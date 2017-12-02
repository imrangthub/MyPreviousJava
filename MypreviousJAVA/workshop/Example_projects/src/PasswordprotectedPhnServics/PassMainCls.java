package PasswordprotectedPhnServics;

import java.util.Scanner;

public class PassMainCls {
	static Scanner myScan=new Scanner(System.in);
	

	public static void main(String[] args) {
	
		System.out.print("Enter your Password:");
		String inputpassword=myScan.nextLine();
		
		if (inputpassword.equals("imran")) {
			System.out.println("=============Welcome Back to your phone Servic===================");
			
			ObjectClassPasswordPhnServic Servic=new ObjectClassPasswordPhnServic();
			String ServiceType=myScan.nextLine();
			
			if (ServiceType.toLowerCase().equals("mobile")) {
				Servic.MobileServic();
				
				
			} else if(ServiceType.toLowerCase().equals("phone")) {
				Servic.PhoneService();
				

			}else {
				System.out.println("Sorry, we can't Sourve you.");
			}
			
			
			
			
			
			
			
			
			
		 }else {
			System.out.println("====  Password Incurrect  =====");
			}
		
		
		
		
		
		
	}

}
