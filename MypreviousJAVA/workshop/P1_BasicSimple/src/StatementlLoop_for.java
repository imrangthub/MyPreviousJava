import java.util.Scanner;

public class StatementlLoop_for {
	static Scanner myScanner;

	public static void main(String[] args) {
		
		int i,j,sum;
		sum=0;
		System.out.println("Enter a number for addition series");
		
		myScanner = new Scanner(System.in);
		j=myScanner.nextInt();
		
		for(i=0; i<=j; i++)
		{
		sum=sum+i;
		System.out.println(i+" =\t\t"+sum);
		
		}



	}

}
