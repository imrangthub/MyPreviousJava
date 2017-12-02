package FileMandgement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMMinputOutput_01_FileReading {

	public static void main(String[] args) {
		
		
		File InputFile=new File("H:\\Inputdoc_2.txt");
		
		
		try {
			Scanner FileScanner=new Scanner(InputFile);
			
			while (FileScanner.hasNext()) {
				
				String tempString=FileScanner.nextLine();
				System.out.println(tempString);
				
				
				
			}
			
			FileScanner.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not foune !");
		}
		
		
		
		
		

	}

}
