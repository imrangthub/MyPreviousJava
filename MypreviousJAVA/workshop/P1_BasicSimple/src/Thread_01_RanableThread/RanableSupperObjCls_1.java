package Thread_01_RanableThread;

public class RanableSupperObjCls_1 implements Runnable {
	
	private String Name;
	private int Counter;
	
	
	
	
	
	
	public RanableSupperObjCls_1(String name, int counter) {
		super();
		Name = name;
		Counter = counter;
	}






	public String getName() {
		return Name;
	}






	public void setName(String name) {
		Name = name;
	}






	public int getCounter() {
		return Counter;
	}






	public void setCounter(int counter) {
		Counter = counter;
	}






	public void run(){
		
	   while (!Thread.currentThread().isInterrupted()) {
			Counter++;
			
		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
				// TODO Auto-generated catch block
				// e.printStackTrace();                             //      No any red latter print anymore... 
			}
			
		
			
		}
		
		
	}

}
