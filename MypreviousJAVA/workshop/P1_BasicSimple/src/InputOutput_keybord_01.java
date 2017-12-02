import java.io.DataInputStream;

public class InputOutput_keybord_01 {

	public static void main(String[] args) {
		
		DataInputStream in=new DataInputStream(System.in);
		char MyChar;
		
		try {
			
			System.out.println("Enter a character: ");
			MyChar=(char)System.in.read();
			System.out.println("You Enter: "+MyChar);
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
       
	}

}
