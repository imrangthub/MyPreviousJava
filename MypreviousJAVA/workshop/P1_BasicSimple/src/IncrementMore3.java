import java.util.Scanner;



public class IncrementMore3 {
	
	static Scanner myScanner;

	public static void main(String[] args) {
		
	int i,j;
	String name;
	
	System.out.println("Enter your Girl friend  name.....");
	myScanner = new Scanner(System.in);
	name=myScanner.nextLine();
	
	System.out.println("How many time you want to say I Love him?");
	myScanner = new Scanner(System.in);
	j=myScanner.nextInt();
	
	for (i=1; i<=j; i++)
	{
		System.out.println("I love you "+name+".");
	}
		
		
		

	}

}
