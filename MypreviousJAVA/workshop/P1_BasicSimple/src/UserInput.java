import java.util.Scanner;

public class UserInput {
	static Scanner MyScanner = new Scanner(System.in);

	public static void main(String[] args) {
	String Myname;	
	
	 System.out.println("Enter your name");
	 
	 
  Myname = MyScanner.nextLine(); 
  System.out.println("Your name is \t"+Myname);
	 
 
	}

}
