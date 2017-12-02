import java.util.Scanner;



public class UserInput_2 {
	static Scanner MyScanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		String s1;
		
		System.out.println("Can you gase my favority person name ?");
		
		s1 = MyScanner.nextLine();
		System.out.println("No "+s1+" is not Favority person.");
		
		int a,b,sum;
		a=15;b=10;
		sum = a+b;
		System.out.println("Who is "+s1+", Is he agest then "+sum+" years old.");
		
		System.out.println("Really you don't know who is the person ?\nOh, It's You Man.....!!!");
		
		System.out.println("Not "+s1+".");

	}
	

}
