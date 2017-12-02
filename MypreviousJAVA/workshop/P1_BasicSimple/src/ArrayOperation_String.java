import java.util.Scanner;

public class ArrayOperation_String {
	static Scanner MyScanner=new Scanner(System.in);

	public static void main(String[] args) {

		String NameList[]=new String[4];
		
		
	for (int i = 0; i < NameList.length; i++) {
		System.out.println("Please enter your name list:");
		NameList[i]=MyScanner.nextLine();
		
	}
	
	System.out.println("Do you want to see this name: "+NameList[1]);
		
		
		
		
		
		
		

	}

}
