import java.util.Scanner;


class MyOtherClass{
	int a,b,c;
	{
	a=10;
	b=20;
	c=b-a;
	System.out.println("MyotherClass value is: "+c);
	}
	{
	System.out.println("This is Other Class Sysout:");
   }
	
	
	
	int Addition(int Num1, int Num2){
		int sum=Num1+Num2;
		return sum;
	}
	
	 static void Subtraction(int Num1,int Num2){
		int sum=Num1-Num2;
		System.out.println(sum);
	}
	
	
	
}

public class C_M_O_Calling_method_function_01 {
	static Scanner Myscanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter your First Name: ");
		String Fname=Myscanner.nextLine();
		System.out.println("Enter your Last Name: ");
		String lname=Myscanner.nextLine();

		
		NameShow(Fname, lname);
		System.out.println(NameShow_2(Fname, lname));
		System.out.println("Enter two value for Addition: ");
		int Value1=Myscanner.nextInt();int Value2=Myscanner.nextInt();
		
		
		MyOtherClass myoth=new MyOtherClass();
		System.out.println(myoth.Addition(Value1, Value2));
		MyOtherClass.Subtraction(Value1, Value2); 
		
		
	}
	
	static void NameShow(String fn,String ln){
		System.out.println("Your Name is: "+fn.toUpperCase()+" "+ln.toUpperCase());
		
	}
	
	static String NameShow_2(String fn,String ln){
		
		return ("Your Name is: MD "+fn.toUpperCase()+" "+ln.toUpperCase());
	}
	
	
	
}
