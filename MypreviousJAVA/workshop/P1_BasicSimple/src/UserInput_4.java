import java.util.Scanner;


public class UserInput_4 {
	static Scanner myScanner1;
	  

	public static void main(String[] args) {

  System.out.println("Enter tow value for addition.");
  
  int a,b,sum;
  
  myScanner1 = new Scanner(System.in);
  a= myScanner1.nextInt();
	
  

  myScanner1 = new Scanner(System.in);
  b = myScanner1.nextInt();
  
  sum=a+b;
  System.out.println("The addition is "+sum);
  
  System.out.println("Now enter two Number for Substrection");
  
  
  myScanner1 = new Scanner(System.in);
  int x;
  x = myScanner1.nextInt();
  
  
 myScanner1 = new Scanner(System.in);
 int y;
 y = myScanner1.nextInt();
 
 sum = x-y;
 
 System.out.println("The Substraction is "+sum+"\nPlease Enter your neme");
 
 myScanner1 = new Scanner(System.in);
 String name;
 name = myScanner1.nextLine();
 System.out.println("Thane you "+name);
 
 
 
 
 
 
	}

}
