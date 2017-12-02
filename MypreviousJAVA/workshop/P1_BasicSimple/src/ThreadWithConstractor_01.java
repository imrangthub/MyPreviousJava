


class MyThreaded extends Thread{
	String threadName;
	int statrPoint;
	int addingvalue;
	int counter;
	boolean threadAlive;
	public MyThreaded(String threadName, int statrPoint, int addingvalue, boolean threadAlive) {
		super();
		this.threadName = threadName;
		this.statrPoint = statrPoint;
		this.addingvalue = addingvalue;
		this.threadAlive = threadAlive;
	}
	
	
	public void run(){
		while (counter<=10) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter=counter+addingvalue;
			
		}
		
		
		
	}
	
	
}


public class ThreadWithConstractor_01 {

	public static void main(String[] args) {

		MyThreaded Mts=new MyThreaded("Process_01", 0, 1,true);
		Mts.start();
		
		while (Mts.counter<=100) {
			System.out.println("The process_01 value is "+Mts.counter);
			
		}
		

	}

}
