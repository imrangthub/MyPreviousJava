
public class Statement_loop_for4 {

	public static void main(String[] args) {
		
		
		loop1: for (int i = 5; i >= 1; i--) {
			System.out.println("o");
			for (int j = 1; j <=5; j++) {
				System.out.print("-");
				
				if(i==j) continue loop1;
				

				
			}
		
		}
	
	}

}
