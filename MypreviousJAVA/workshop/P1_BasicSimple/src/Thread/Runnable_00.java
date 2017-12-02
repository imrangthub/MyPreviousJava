package Thread;


class Runnable_00 {

	public static void main(String[] args) {
		System.out.println("Start Main Method....");
		
		Runnable MYRN_1=new MeRn(1, 5, 1000);
		Runnable MYRN_2=new MeRn(1, 50, 500);
		Thread Th_01=new Thread(MYRN_1);
		Thread Th_02=new Thread(MYRN_2);
		Th_01.start();
		try {
			Th_01.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Th_02.start();
		
		
	
		System.out.println("End Main Method.");
	}
}


class MeRn implements Runnable{
	
	
	int StartPoint;
	int EndPoint;
	int DelayTim;
	int counter;

	
	
	
	public MeRn(int startPoint, int endPoint, int delayTim) {
		super();
		StartPoint = startPoint;
		EndPoint = endPoint;
		DelayTim = delayTim;
	}

	public void run(){
		for (counter = StartPoint; counter <=EndPoint; counter++) {
			
			try {
				Thread.sleep(DelayTim);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Step No: "+counter);
			
		}
		
		
	}
}
