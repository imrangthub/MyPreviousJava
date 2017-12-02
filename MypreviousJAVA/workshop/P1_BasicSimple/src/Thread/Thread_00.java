package Thread;


class Thread_00 {

	public static void main(String[] args) {
		System.out.println("Start Main Method....");
		MeThread Thre_1=new MeThread(1, 5, 0, 1000);
		MeThread Thre_2=new MeThread(1, 10, 0, 500);
		MeThread Thre_3=new MeThread(100, 150, 0, 300);
		Thre_1.start();
		
		try {
			Thre_1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	    Thre_2.start();
		Thre_3.start();
		
		
		System.out.println("End Main Method.");
	}
}




class MeThread extends Thread{
	
	int StartPoint;
	int EnndPoint;
	int Counter;
	int DelayTim;
	
	
	
	public MeThread(int startPoint, int enndPoint, int counter, int delayTim) {
		super();
		StartPoint = startPoint;
		EnndPoint = enndPoint;
		Counter = counter;
		DelayTim = delayTim;
	}





	
	
	public void run(){
		
		for (Counter= StartPoint; Counter <=EnndPoint; Counter++) {
			
			try {
				sleep(DelayTim);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("First Loop Counter: "+Counter);
			
			
		}
		
		
		
		
	}
	
	
}

