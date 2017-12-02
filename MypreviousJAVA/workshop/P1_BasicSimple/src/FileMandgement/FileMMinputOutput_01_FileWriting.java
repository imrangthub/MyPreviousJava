package FileMandgement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMMinputOutput_01_FileWriting {

	public static void main(String[] args) {
		
		File Outputfiles=new File("H:\\Inputdoc_10.txt");
		File InputFle=new File("H:\\Inputdoc_2.txt");
		
		
		
		try {
			
			FileWriter fwrt=new FileWriter(Outputfiles);
			
			Scanner MScanner=new Scanner(InputFle);
			
			while (MScanner.hasNext()) {
				String tempVariable=MScanner.nextLine();
			      fwrt.write(tempVariable+" \n");
				
			}
			MScanner.close();
			fwrt.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found !");
		}
		
		
		
		
		
		
		System.out.println("Printing Complited !");
		

	}

}
