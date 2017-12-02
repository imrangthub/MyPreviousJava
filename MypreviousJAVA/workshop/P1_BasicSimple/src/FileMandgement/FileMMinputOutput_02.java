package FileMandgement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMMinputOutput_02 {

	public static void main(String[] args) {
		
		File InputFle=new File("H:\\Inputdoc_2.txt");
		File OutputFle=new File("H:\\Outputdoc_2.txt");
		
		try {
			FileReader filereader=new FileReader(InputFle);
			try {
				FileWriter filewriter=new FileWriter(OutputFle);
				
				Scanner scanner=new Scanner(filereader);
				while (scanner.hasNext()) {
					String tempS=scanner.nextLine();
					//
					filewriter.write(tempS+"\t\n");
					
					
				}
				scanner.close();
				filereader.close();
				filewriter.close();
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Output file not found !");
			}
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("Imput File Not Found !");
		}
			
			
			
			
		
		
		
		
		

	}

}
