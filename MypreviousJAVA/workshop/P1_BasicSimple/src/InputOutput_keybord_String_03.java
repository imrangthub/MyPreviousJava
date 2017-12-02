import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_keybord_String_03  {
	public static void main(String[] args) throws IOException{
		
	
 
		String Name,UserInp;
		Integer Roll;
		Float Mark;
		
		InputStreamReader IN=new InputStreamReader(System.in);
		BufferedReader BR=new BufferedReader(IN);
		
		System.out.println("Enter your name please: ");
		Name=BR.readLine();
		
		System.out.println("Enter your Roll: ");
		UserInp=BR.readLine();
		Roll=Integer.valueOf(UserInp);
		
		System.out.println("Enter your Mark: ");
		UserInp=BR.readLine();
		Mark=Float.valueOf(UserInp);
		
		
		System.out.println("Name is "+Name);
		System.out.println("Roll is "+Roll);
		System.out.println("Mark is "+Mark);
		
		
			
		

	}

}
