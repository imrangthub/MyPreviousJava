package Thread_01_RanableThread;

import java.util.Scanner;

public class RanableMainCls {
	static Scanner MyScanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		RanableSupperObjCls_1 ThSubObjNum_1=new RanableSupperObjCls_1("First", 0);
		RanableSupperObjCls_1 ThSubObjNum_2=new RanableSupperObjCls_1("Second", 200);
        RanableSupperObjCls_1 ThSubObjNum_3=new RanableSupperObjCls_1("Thread", 3000);
       
        
        
       Thread FirstThread=new Thread(ThSubObjNum_1);
       Thread SecondThread=new Thread(ThSubObjNum_2);
       Thread ThirdThread=new Thread(ThSubObjNum_3);
       Thread ForthThread=new Thread(ThSubObjNum_1);
       
      FirstThread.start();ThirdThread.start();
       System.out.println("Enter your value:");
       
       String userInput=MyScanner.nextLine();
       
       while (!userInput.toLowerCase().equals("exit")) {
    	   
			 if (userInput.equals("1")) {
				System.out.println("FirstThread Counter  is: "+ThSubObjNum_1.getCounter());
				
			 }else if (userInput.equals("1stop")) {
					FirstThread.interrupt();
					System.out.println("FirstThread is STOP:");
			 }else if (userInput.equals("2")) {
					System.out.println("SecondThread Counter  is: "+ThSubObjNum_2.getCounter());
					
				 }else if (userInput.equals("2start")) {
					 SecondThread.start();
					 System.out.println("SecondThread STaRt:");
					
				}else if (userInput.equals("2stop")) {
						SecondThread.interrupt();
						System.out.println("SecondThread is STOP:");
				 }else if (userInput.equals("3")) {
					 System.out.println("FirstThread Counter  is: "+ThSubObjNum_3.getCounter());
				}else if (userInput.equals("3stop")) {
					ThirdThread.interrupt();
					System.out.println("ThirdThird is STOP:");
			 }else if (userInput.equals("4")) {
				 System.out.println("FirstThread Counter  is: "+ThSubObjNum_1.getCounter());
			}else if (userInput.equals("4stop")) {
				ForthThread.interrupt();
				System.out.println("ForthThread is STOP:");
		 }
			 
			  else {
				System.out.println("Worng Input.");
			}
			userInput=MyScanner.nextLine();
			
		}
      



	}

}
