import java.util.Scanner;

public class DecrementMore3 {

	static Scanner myScanner;
	
	public static void main(String[] args) {

		int i,j;
System.out.println("Inseart a number to Descanding sort");


myScanner=new Scanner(System.in);
j=myScanner.nextInt();
		
		
		for (i=j; i>=1; i--)
		{
			System.out.println(i);
		}

	}

}
