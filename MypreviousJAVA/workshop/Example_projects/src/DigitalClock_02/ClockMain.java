package DigitalClock_02;

import java.util.Scanner;



class ClockSuper extends Thread{
	
	
	int HCounter;
	int MCounter;
	int SCounter;
	int Counter;
	Boolean ThAlive;
	
	
	
	
	public void run(){
		

			
			while (!ThAlive==false) {
				
			
		
		for (HCounter =1; HCounter <= 24; HCounter++) {
			
			for( MCounter = 0; MCounter <=59; MCounter++) {
				
				for (SCounter = 0; SCounter <=59; SCounter++) {
					
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
			if (HCounter==24){ HCounter=0;}
		}
		
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
//	
//	public ClockSuper(int hCounter, int mCounter, int sCounter) {
//		super();
//		HCounter = hCounter;
//		MCounter = mCounter;
//		SCounter = sCounter;
//	}














	
	

    public void killThread() {
		ThAlive = false;
	}
    
    
    public void runningThread(){
         ThAlive=true;
    }










	public void setThAlive(Boolean thAlive) {
		ThAlive = thAlive;
	}










	public int getHCounter() {
		return HCounter;
	}
	public void setHCounter(int hCounter) {
		HCounter = hCounter;
	}
	public int getMCounter() {
		return MCounter;
	}
	public void setMCounter(int mCounter) {
		MCounter = mCounter;
	}
	public int getSCounter() {
		return SCounter;
	}
	public void setSCounter(int sCounter) {
		SCounter = sCounter;
	}
	public int getCounter() {
		return Counter;
	}
	public void setCounter(int counter) {
		Counter = counter;
	}
	
	
	
	
	
	
	
}

public class ClockMain extends Thread{
	public static Scanner clS=new Scanner(System.in);
	public static void main(String[] args) {
		
		ClockSuper clock=new ClockSuper();
		
		
	        System.out.println("Please Set Current time First\n");
	        clock.runningThread();
	       
	        clock.start();
	        System.out.print("Houre: ");
	        int UserHr=clS.nextInt();
	        if (UserHr>=0&&UserHr<=24) {
	        	System.out.print("Minute: ");
		        int UserMi=clS.nextInt();
	        if (UserMi>=0&&UserMi<=59) {
	        	 System.out.print("Second: ");
	 	        int userSc=clS.nextInt();
	 	        if (userSc>=0&&userSc<=59) {
	 	        	clock.setHCounter(UserHr);clock.setMCounter(UserMi);clock.setSCounter(userSc);
					
					
	        
	        
	        
	       
	        
	        
	        
	        
	        System.out.print("\n\nClock Lunching");
	        
              for (int i = 0; i < 5; i++) {
            	  try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	  System.out.print(".");
				
			}
			
			  
			 
			 
			 for (;;) {
				 
				 try {
					 
					 
					 System.out.println("\n"+clock.getHCounter()+" : "+clock.getMCounter()+" : "+clock.getSCounter());
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
        		
	                  } else {
	                	  System.out.println("Try Again? y for Yes press Anykey for Exit");
	                	  String newinputs=clS.next();
	                	    if (newinputs.toLowerCase().equals("y")) {
	                	    	ClockMain.main(null);
								
							} else {
								clock.killThread();
								System.out.println("you press N");

							}
	    				}
				
		
	               } else {
	            	   System.out.println("Try Again? y for Yes press Anykey for Exit");
	                	  String newinputs=clS.next();
	                	    if (newinputs.toLowerCase().equals("y")) {
	                	    	ClockMain.main(null);
								
							} else {
								clock.killThread();
								System.out.println("you press N");

							  }
	    		    }
	        	
        	 } else {
        		 System.out.println("Try Again? y for Yes press Anykey for Exit");
           	  String newinputs=clS.next();
           	    if (newinputs.toLowerCase().equals("y")) {
           	    	ClockMain.main(null);
						
					} else {
						clock.killThread();
						System.out.println("you press N");

					  }
        		 
        	
        		 
        		 
           	  
				}
	
		
		
		

	}

}
