import java.util.Scanner;



public class C_M_O_methodwith_Argument {
	static Scanner  MyScanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
	
	     int ans;
		
		
	
	ans=Argument(0, 2, 3  );
		System.out.println(ans);
		
		
		
		String Myname="MD IMRAN";
		
		
		
		System.out.println(Argument1(Myname));
		
		
		
		
		
		
		
	}
	
	
	static int Argument(int x, int y,int z ){
	int sum;
	sum=x+y*z;
		return sum; 
	}
	
	static String Argument1(String Name){
		
		Name=Name.toLowerCase();
		
		return Name;
	}
	
	

	
}
