import java.util.Scanner;

public class StatementlLoopWith_continue {
  static Scanner myS=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		
		
         for (int i = 0; i < 100; i++) {
			
			if(i==10)
				break;
			System.out.println(i);
		}
		
		
		
		
		for(;;){
		System.out.println("Please  Enter [ ex ] for exit the program:");
		String UI=myS.nextLine();
			if (!UI.toLowerCase().equals("ex")) 
				
				continue;
			else
				break;
			
			
			
		}
		
		System.out.println("Exit from Loop:");

	}

}
