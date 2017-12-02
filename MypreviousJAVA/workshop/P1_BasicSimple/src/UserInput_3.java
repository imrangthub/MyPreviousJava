import java.util.Scanner;

public class UserInput_3 {
static Scanner MyScanner = new Scanner(System.in);
 static Scanner myScanner2,myScanner3;
 
	
	public static void main(String[] args) {
		
		System.out.println("Enter your age please");
		
		int age;
		age = MyScanner.nextInt();
		System.out.println("Your "+age+" year old.");
		
		
		{
			System.out.println("Enter your Name.");
			
			myScanner2 = new Scanner(System.in);
			String name;
			name = myScanner2.nextLine();
			System.out.println("Your name is "+name);
			
		}
		
		{
			System.out.println("Enter a numbr");
			myScanner3 = new Scanner(System.in);
			float x;
			x = myScanner3.nextFloat();
			System.out.println("You enter "+x);
			
		}
		
		{
			
			System.out.println(age-5);
		}
		
	}
 
}
