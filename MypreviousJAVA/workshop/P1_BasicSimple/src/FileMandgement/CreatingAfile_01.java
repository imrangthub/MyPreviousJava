package FileMandgement;

import java.io.FileWriter;
import java.io.IOException;

public class CreatingAfile_01 {

	public static void main(String[] args) throws IOException{
		
		FileWriter FR= new FileWriter("H:\\imran.txt");
		
		
		FR.close();



	}

}
