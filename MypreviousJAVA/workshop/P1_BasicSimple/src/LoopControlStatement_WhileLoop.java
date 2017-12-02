import java.util.Scanner;

public class LoopControlStatement_WhileLoop {
	static Scanner ms=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		String userin;
		
		do {
			System.out.println("Exit from loop please Enter: [Exit]");
			 userin=ms.nextLine();
			System.out.println("You Enter: "+userin);
			
		} while (!userin.toLowerCase().equals("exit"));
		
		System.out.println("============ Exit to the program  ================");

  }
	
	
}
	
	
	


