


class Mythread extends Thread				// Creating Thread class

{
	public void run()                          // Run Method
	{
		
		for (int i = 1; i<=5; i++) {
			
			System.out.println("Loop executing step: "+i);
			
		}
		System.out.println("Exit from Thread A");
	}
	
}                                                   //   Exit Thread class



public class ThreadMyThread_01 {                     // Start Main class

	public static void main(String[] args) {
		
	Mythread Th_1 = new Mythread();                // creating object
	
	System.out.println("Starting loop");
	
	Th_1.start();                                  // calling   Run method form thread class
 	
	System.out.println("Exit form main() Method");
		
		
		
		}

}
