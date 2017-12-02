import java.util.Scanner;



public class C_M_O_methodwith_Argument2 {
	
	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
	
			
	prn("Enter two number for comparing for Height: ");
	
	int a=myScanner.nextInt();
	int b=myScanner.nextInt();
	
	int Result = formula1(a, b);
	
	
	
		
	prn("Enter two number for the lowest: ");
	
	int x = myScanner.nextInt();
	int y = myScanner.nextInt();
	
	int Result2=formula2(x, y);
	
	
	
	
	prln("The height Number between "+a+" and " +b +" is: - " +Result);
	prln("The lowest number between "+x+" and " +y+"  is:- "+Result2);
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	static int formula1(int a, int b){
		int ans;
		if(a>b) {
		ans=a;	
		}
		else {
			ans=b;
		}
		
		 return (ans);
   }
	
	
	
	static int formula2(int x, int y){
	int ans;
	if(x<y){
		ans=x;
	}
	else {
		ans=y;
	}
		return(ans);
	}
	
	
	
	
	 static void prln(Object anyObject){
		System.out.println(anyObject);
    }
	
	
	static void prn(Object anyObject){
		System.out.print(anyObject);
	}

}
