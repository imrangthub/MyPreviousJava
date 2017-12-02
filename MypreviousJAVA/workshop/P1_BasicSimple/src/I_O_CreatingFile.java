import java.io.FileWriter;
import java.io.IOException;

public class I_O_CreatingFile {

	public static void main(String[] args)throws IOException {
		
		FileWriter fr =new FileWriter("H:\\Document_1.txt");
		fr.close();
		
		System.out.println("Operation Successfully");

	}

}
