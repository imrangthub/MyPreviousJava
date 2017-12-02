package Thread;

import java.util.Scanner;

public class ThreadMainCls {
     static Scanner TrhMinClsScanner=new Scanner(System.in);
	public static void main(String[] args) {
		ThreadDefinedSuperCls_01 TH_01=new ThreadDefinedSuperCls_01("TH_01_Process_1",1, 0, 500,true);
		ThreadDefinedSuperCls_01 TH_02=new ThreadDefinedSuperCls_01("TH_02_Process_1", 10, 0, 1000,true);
		TH_01.start();
		System.out.println("======================= Welcome To My Thread Programming =========================");
		System.out.println("Enter a value:\n[1] for 'see process_1 counter. [1stop] for sotp it   and 2 for see 2no process 2stop for s:");
		String userInput=TrhMinClsScanner.nextLine();
		
		while (!userInput.toLowerCase().equals("exit")) {
			 if (userInput.equals("1")) {
				System.out.println("TH_01 process_1 counter  is: "+TH_01.getCounter());
				
			}else if (userInput.equals("1stop")) {
				TH_01.stopThtead();
				System.out.println("TH_01 process_1 is STOP.");
				
			}else if (userInput.equals("2start")) {
				TH_02.start();
				System.out.println("TH_02 process_1 is START.");
				
			}else if (userInput.equals("2restart")) {
				TH_02.startThread();
				System.out.println("TH_02 process_1 is START.");
			}else if (userInput.equals("2")) {
				System.out.println("TH_01 process_1 counter  is: "+TH_02.getCounter());
				
			}else if (userInput.equals("2stop")) {
				TH_02.stopThtead();
				System.out.println("TH_02 process_1 is STOP.");
				
			}else {
				System.out.println("Wrong Input");

			}
			userInput=TrhMinClsScanner.nextLine();
		}
		
		
		
		

	}

}
