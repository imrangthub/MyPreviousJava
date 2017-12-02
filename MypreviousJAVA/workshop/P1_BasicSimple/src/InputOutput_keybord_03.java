import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_keybord_03 {

	public static void main(String[] args) throws IOException {
		
		int R0oll;
		String UserInputs;
		
		InputStreamReader IN=new InputStreamReader(System.in);
		BufferedReader BR= new BufferedReader(IN);
		
		
		
		System.out.println("Enter Our Roll: ");
		UserInputs=BR.readLine();
		R0oll=Integer.parseInt(UserInputs);
		
		System.out.println("Your Roll is: "+R0oll);
		
		
		
		System.out.println("Enter Marek:");
		UserInputs=BR.readLine();
		float Mark=Float.parseFloat(UserInputs);
		
		System.out.println("Your Mark is: "+Mark);
		
		
		
		
		
		

	}

}
