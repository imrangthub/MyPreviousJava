

import java.util.Scanner;

class GetSetThread extends Thread{
	
	String threadName;
	int startpoint;
	int counter;
	int addingdata;
	boolean aliveTh;
	
	
	
	public GetSetThread(String threadName, int startpoint, int addingdata, boolean aliveTh) {
		super();
		this.threadName = threadName;
		this.startpoint = startpoint;
		this.addingdata = addingdata;
		this.aliveTh = aliveTh;
	}
	
	
	public void run(){
		startpoint=counter;
		while (aliveTh) {
			try {
				sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter+=addingdata;
		}
		
	}



	public String getThreadName() {
		return threadName;
	}



	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}



	public int getStartpoint() {
		return startpoint;
	}



	public void setStartpoint(int startpoint) {
		this.startpoint = startpoint;
	}



	public int getCounter() {
		return counter;
	}



	public void setCounter(int counter) {
		this.counter = counter;
	}



	public int getAddingdata() {
		return addingdata;
	}



	public void setAddingdata(int addingdata) {
		this.addingdata = addingdata;
	}



	public boolean isAliveTh() {
		return aliveTh;
	}



	public void setAliveTh(boolean aliveTh) {
		this.aliveTh = aliveTh;
	}
	
	
	public void stopThread(){
		this.aliveTh=false;
	}
	

	
	
	
	
}



public class ThreadWithGetterandSetterMethod {
	static Scanner MygstScanner=new Scanner(System.in);

	public static void main(String[] args) {
		GetSetThread GST= new GetSetThread("Peocess_1", 0, 1,true);
		GetSetThread GST_02=new GetSetThread("Process_01", 0, 5, true);
		GST.start();GST_02.start();
		System.out.println("Enter your value what do you want: ");
		String userinput=MygstScanner.nextLine();
		
		while (!userinput.toLowerCase().equals("exit")) {
                   if (userinput.equals("1")) {
				
				System.out.println("The process_1 counter value is: "+GST.getCounter());
				
			} else if (userinput.equals("1s")) {
				GST.stopThread();
			System.out.println("process_1 hasbeen STOPED");
			} else  if (userinput.equals("2")) {
				
				System.out.println("The process_2 counter value is: "+GST_02.getCounter());
				
			} else if (userinput.equals("2s")) {
				GST_02.stopThread();
			System.out.println("process_2 hasbeen STOPED");
			
			}else{
				System.out.println("Wrong input");
               
			}
			
                   userinput=MygstScanner.nextLine();
	}
		
		
		
		
	}
	
	

}
