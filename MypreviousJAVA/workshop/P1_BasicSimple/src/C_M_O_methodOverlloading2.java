import java.util.Scanner;

public class C_M_O_methodOverlloading2 {
	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
	
	
	prn("Enter a name for Uppercase it:");
     String num1=myScanner.nextLine();
	Mymethod(num1);
	
	prn("Enter a Double number for double it");
	Double num=myScanner.nextDouble();
	Mymethod(num);
	
	prn("Enter a Integer for double it:");
	int x=myScanner.nextInt();
	Mymethod(x);
	
	
	
	

	
	
	
	
	}
	static String Mymethod(String name){
		name=name.toUpperCase();
		prn(name);
		return name;
	}
	
	static int Mymethod(int y){
		y=y*2;
		prn(y);
		return y;
	}
	
	static Double Mymethod(Double x){
		
	x=x*2;
	prn(x);
	return x;
	
	}
	
	static void prn(Object anyObject){
		System.out.println(anyObject);
	}
}
