import java.util.Scanner;

public class ArrayOperation_02 {
	static Scanner MyScanner_01=new Scanner(System.in); 

	public static void main(String[] args) {

		//

		int MyArray_1 [] = {11,22,33,44,55};
		
		
		System.out.println(MyArray_1[0]);
		System.out.println("The MyArray_1[5] no Index value is "+MyArray_1[4]);
		
		int sum=MyArray_1[1]-MyArray_1[0];
		sum=sum-1;
		System.out.println("The sumation is "+ sum);
		
		
		//
		
		//
		
		int MyArray_2[]={11,22,22,33,44,55};
		
		for (int i = 0; i<=5; i++) {
			
			System.out.println("The Index is MyArray_2 ["+i+"] value is = "+MyArray_2[i]);
			
		}
		
		//
		
		//
		
		int Arr_1[],Arr_2[];
		Arr_1=new int[3];
		Arr_1[0]=100;
		Arr_1[1]=200;
		Arr_1[2]=300;
		
		Arr_2=new int[3];
		Arr_2[0]=2;
		Arr_2[1]=3;
		Arr_2[2]=4;
		
		System.out.println("\nThe Two Array sumation is "+Arr_1[0]/Arr_2[0]);

		//
		
		//
		
		int Arry_01[]=new int [5];
		 
		 for (int i = 0; i < Arry_01.length; i++) {
			 System.out.println("My name is BaBu");
			
		}
		
		 //
		 
		 //
		 
		 int UserInputArray[] = new int[4];
		 System.out.println("Enter five valu for Array ");
		 
		 for (int i = 0; i < UserInputArray.length; i++) {
				UserInputArray[i]=MyScanner_01.nextInt();
				}
		 
		 sum=UserInputArray[0]+UserInputArray[3];
		 System.out.println("The Last  and first Index array addition  of UserInputArray[] is = "+sum);
			
			
		
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
