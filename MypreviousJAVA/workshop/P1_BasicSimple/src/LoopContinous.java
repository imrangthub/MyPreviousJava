
public class LoopContinous {

	public static void main(String[] args) {
		
		
		
		 for (int i = 1; i <=10; i++) {
			
			System.out.println("Main loop Step: ============= "+i);
			
			for (int j = 0; j <=3; j++) {
				System.out.println("Second loop Step: "+j);
				
			}
			
		 
			if (i==6){
			i=0;	
			}
			
		}



	}

}
