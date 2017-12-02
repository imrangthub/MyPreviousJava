import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_keybord_String_02 {

	public static void main(String[] args) throws IOException {
		int Roll;
		float Mark;
		String Name;
		String UserIn;
		
	InputStreamReader IN=new InputStreamReader(System.in);
	BufferedReader BR=new BufferedReader(IN);
	System.out.println("Enter your Roll: ");
	UserIn=BR.readLine();
	Roll=Integer.parseInt(UserIn);
	
	System.out.println("Enter Mark:");
	UserIn=BR.readLine();
	Mark=Float.parseFloat(UserIn);
	
	System.out.println("Enter your Name:");
	UserIn=BR.readLine();
    Name=UserIn;
    
    
    System.out.println("Your Name is "+Name);
    System.out.println("Your Roll is: "+Roll );
    System.out.println("Your Mark is: "+Mark);
		
	}

}
