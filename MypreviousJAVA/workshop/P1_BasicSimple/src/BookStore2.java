
import java.util.Scanner;

public class BookStore2 {
static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		String Userinput1;
		

      print("Which book do you want ? ");
      
		Userinput1=myScanner.nextLine();
		
		if (Userinput1.toLowerCase().equals("java")) {
			print("You want JAVA book");
			print("Are you Student, Teacher or Employee?");
			String name=myScanner.nextLine();
			calculation(name);
			
			
		}else if (Userinput1.toLowerCase().equals("c")) {
			
			print("You want a C/C++ Book");
			print("Are you Student, Teacher or Employee?");
			String name=myScanner.nextLine();
			calculation(name);
		}
		else if (Userinput1.toLowerCase().equals("php")) {
			print("You want to a PHP book");
			print("Are you Student, Teacher or Employee?");
			String name=myScanner.nextLine();
			calculation(name);
		}else {
			print("Sorry, here is no book in store that you Want..!");
	}
		
		print("Thank you for visiting our shop");
		
		
		
		  
	 
		
		
		
		
		

	}

	static  void  calculation(String who){
	double price=100;
		if (who.toLowerCase().equals("teacher")) {
			price = price-(price*.25);
			print("Your pay able amount is "+price);
			
			
		}else if (who.toLowerCase().equals("student")) {
			
			price=price-(price*.3);
			print("Your payable amount is "+price);
			
		}else if(who.toLowerCase().equals("employee")) {
			price= price-(price*.2);
			print("your payable amount is "+price);
		}else {
			print("Sorry we can't serve you.");
		}
	
		  
			
		 
		 
		
			
		}
	
	
	
	
	static void print(Object myobj){
		System.out.println(myobj);
	}
}
