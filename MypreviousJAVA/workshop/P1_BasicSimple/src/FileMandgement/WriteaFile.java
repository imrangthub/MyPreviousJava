package FileMandgement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteaFile {

	public static void main(String[] args) {
		
		
		File OutputFile=new File("");
		
		
		
		
		
		try {
			
			FileWriter FWt=new FileWriter(OutputFile);
			
			
			
        		FWt.write(" I love java programming.");
        	
		
			
			FWt.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found!");
		}
		
		
		System.out.println("Successfull");
		
		

	}

}
