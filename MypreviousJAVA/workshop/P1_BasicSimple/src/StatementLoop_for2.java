import java.util.Scanner;

public class StatementLoop_for2 {
		static Scanner myScanner;
	public static void main(String[] args) {


		int i,j,sum1,sum2;
		sum1= sum2 = 0;
		System.out.println("Enter your number to see odd and Even");
		myScanner = new Scanner(System.in);
		j=myScanner.nextInt();
		System.out.println("Odd\t\tEven");
		
		for(i=1; i<=j; i++)
		{
			if (i%2!=0)
			{
				sum1=i;
					
			}
			else
			{ 
				sum2=i;
				System.out.println(sum1+"\t\t"+sum2);
			}
			
			
		}
		
		
		

	}

}
