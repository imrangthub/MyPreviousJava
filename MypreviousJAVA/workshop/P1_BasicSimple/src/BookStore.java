
import java.util.Scanner;

public class BookStore {
	static Scanner MyScanner=new Scanner(System.in);
	
	static String[] Books={"JAVA","C","PhP"};
	static final double StudentDiscount=0.3;
	static final double TeacherDiscount=0.2;
	static final double EmployeDiscount=0.1;

	public static void main(String[] args) {
	
		
		prln("-----------------Welcome to my Our Book store-----------------");
		prn("Which Book do you want?\nAns: ");
		String UserChoice=MyScanner.nextLine();
		
		if (Books[0].toLowerCase().equals(UserChoice.toLowerCase())){
			prln("you choice for "+Books[0]+" book.");
			Calculation(Books[0]);
		}
		else if (Books[1].toLowerCase().equals(UserChoice.toLowerCase())) {
			prln("you choice for "+Books[1]+" book.");
			Calculation(Books[1]);
		}
		
		else if (Books[2].toLowerCase().equals(UserChoice.toLowerCase())) {
			prln("you choice for "+Books[2]+" book.");
			Calculation(Books[2]);
		}
		else {prln("Sorry this Book Not in our store, may we you try later");
		
		}
	

	}
	static Scanner myScanner=new Scanner(System.in);
	
	
	static void Calculation(String bookName){
		prn("Are you Student, Teacher or Employee?\nAns:");
		String ans=myScanner.nextLine();
		
		double price=200;
		
		if (ans.toLowerCase().equals("student")) {
			price=price-(price*StudentDiscount);
			Showprice(price);
		}
		else if(ans.toLowerCase().equals("teacher")) {
			price=price-(price*TeacherDiscount);
			Showprice(price);
		}
		else if(ans.toLowerCase().equals("employee")) {
			price=price-(price*EmployeDiscount);
			Showprice(price);
		}
		else{prln("Sorry for you.");
		
		}
		
	}
	
	static void Showprice(double price){
		prln("your payable price is: "+price);
		prln("Thank you for come our Shop.");
	}
	
	static void prln(Object myobject){
		System.out.println(myobject);
	}
	static void prn(Object myObject){
		System.out.print(myObject);
	}

}
