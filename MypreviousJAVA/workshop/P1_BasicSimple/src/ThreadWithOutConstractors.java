class MyThreadx extends Thread{
	
	String processName;
	int stratrPoint;
	int counter;
	int adding;
	boolean aliveThread;
	
	void getData(){
		processName="process_01";
		stratrPoint=0;
		adding=1;
		aliveThread=true;
		counter=0;
		
	}
	
	
	public void run(){
		stratrPoint=counter;
		while (aliveThread) {
			
			counter+=adding;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End process_01");
		
	}
	
}




public class ThreadWithOutConstractors {

	public static void main(String[] args) {
		MyThreadx MT=new MyThreadx();
		MT.getData();
		MT.start();
		
		
		while (MT.aliveThread) {
		
			System.out.println("This is MyThread process: "+MT.counter);
			
			
		}
		

	}

}
