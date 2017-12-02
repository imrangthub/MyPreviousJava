import java.io.FileReader;
import java.io.IOException;

public class I_O_fileOpening {

	public static void main(String[] args)throws IOException {
		
		FileReader frs= new FileReader("H:\\Document_1.txt");
	
		System.out.println(frs.read());
		frs.close();
      
	}

}
