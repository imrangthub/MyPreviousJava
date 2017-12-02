import java.io.DataInputStream;
import java.io.IOException;

public class InputOutput_keybord_02 {

	public static void main(String[] args) throws IOException {
		
		char UserInput;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter a Character: ");
		UserInput=(char)System.in.read();
		System.out.println("You Enter: "+UserInput);
		
		

	}

}
