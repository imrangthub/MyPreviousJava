import java.util.Scanner;

public class Statement_while_Loop {
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		                                           //        While ( condition ) {
		                                          //           \\  do Something
		                                         //           }
		int i;
		i=0;
		
		
	while (i<10) {
		System.out.println("The number is "+i);
		i++;
	}
	
	
	
	
	System.out.print("Please inter your name......");
	String name= myScanner.nextLine();
	System.out.print("How many time you want see your name in Scann? ");
	int many=myScanner.nextInt();
	
	while (many>=1) {
		System.out.println("your name is "+name);
		many--;
		
	}
	
	
	
	
	
		
		
	}
	
	
}
