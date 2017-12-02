import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_keybord_String_01 {

	public static void main(String[] args) throws IOException {
		
		String UserIn;
		InputStreamReader IN=new InputStreamReader(System.in);
		BufferedReader BR=new BufferedReader(IN);
		System.out.println("Enter a your Name: ");
		UserIn=BR.readLine();
		System.out.println(UserIn+"\n Oh this is a Good Name.");
		
		
		
		

	}

}
