import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class I_O_WritingInFile {

	public static void main(String[] args)throws IOException {
		
		FileWriter fws=new FileWriter("H:\\Document_1.txt");
		System.out.println("A Document open for writing: (press ENTER for Save it) ");
		FileOutputStream fos=new FileOutputStream("H:\\Document_1.txt");
		
		char c = (char)System.in.read();       //Reading a Character...
		
		while (c!='\n') {                    // While not press ENTER...
			fos.write(c);                   // Writhing in to File...
			c=(char)System.in.read();      //  Reading a character..
		
		}
		fos.close();
		fws.close();
		

	}

}
