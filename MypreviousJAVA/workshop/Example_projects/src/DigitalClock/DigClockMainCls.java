package DigitalClock;

import java.util.Scanner;

public class DigClockMainCls {
       
	public static void main(String[] args) {
		
		 
		DigiClockSecond Clock=new DigiClockSecond();
		Clock.start();
		
		System.out.println("press T for the time and E for Exit.");
		Scanner ClockScanner=new Scanner(System.in);
		String UserInpu=ClockScanner.nextLine();
		
		
		
		while (!UserInpu.toLowerCase().equals("e")) {
			
			if (UserInpu.toLowerCase().equals("t")) {
				
				
					
				
				
				System.out.println("The Time is: "+Clock.HCounter+" : "+Clock.MCounter+" : "+Clock.SCounter);
				
			}else{
			
				System.out.println("Wrong Input:");	
			}
			
			
			
			
		
			UserInpu=ClockScanner.nextLine();
	}

		
		
		
	ClockScanner.close();	
	
	
		
		
		
		
 }
}
