import java.util.Scanner;

public class ArrayOperation {
static Scanner myScanner;
	public static void main(String[] args) {
		int Mark[] = {80,70,78,90};
		int i;
		System.out.println("The  mark is Mark[0] = "+Mark[0]);
		System.out.println("The mark is Mark[1] = "+Mark[1]);
		System.out.println("The mark is Mark[2] = "+Mark[2]);
		System.out.println("The  mark is Mark[3] = "+Mark[3]);

		
		System.out.println("\n\nUsing loop\n");
		
		
		for(i=0; i<=3; i++)
		{
			System.out.println("The Mark["+i+"] ="+Mark[i]);
		}
		
		
		
		System.out.println("\n\nAssign value after Declared array\n");
		
		//Other System for Assigning value to Array variable
		
		
		
		int Mark2[];
		Mark2 = new int [5];
		Mark2[0]=80;
		Mark2[1]=90;
		Mark2[2]=85;
		
		for( i=0; i<=2;i++)
		{
			System.out.println("The Mark2["+i+"]="+Mark2[i]);
		}
		
		
		System.out.println("\n\nAssign value from usser input array\n");
		//User input Array variable
		
		
		
		
	
		int S1[] =new int[6];
		
		for(i=1; i<=5; i++)
			
		{
			System.out.print("Enter the Roll["+i+"] Mark...");
		
	
			myScanner = new Scanner(System.in);
			S1[i]=myScanner.nextInt();
		}
		{
			for(i=1; i<=5; i++)
			{
				System.out.println("Roll["+i+"]Mark is ="+S1[i]);
			}
			
		}
		
		
		
	}

}
