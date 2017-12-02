package FileMandgement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting_contineous_01 {
	
	public static Scanner MyS=new Scanner(System.in);

	public static void main(String[] args) {
		
		File OutPutfile=new File("H:\\BABU.doc");
		
		try {
			FileWriter Fw=new FileWriter(OutPutfile);
			
			System.out.println("Writhe your command: ");
			String Command;
			
			do {
				
				Command=MyS.nextLine();
				Fw.write(Command+"\n");
				
			} while (!Command.toLowerCase().equals("exit"));
			
			
			Fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Successfull");
		

	}

}
