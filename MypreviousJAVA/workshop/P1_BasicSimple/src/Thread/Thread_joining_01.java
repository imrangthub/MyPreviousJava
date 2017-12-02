package Thread;

class imran implements Runnable {
	String MyValue;

	public imran(String MyValue) {
		this.MyValue = MyValue;
	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(MyValue);

		}

	}

	public void display() {

	}

}

public class Thread_joining_01 {
   
	public static void main(String[] args) {
		
		System.out.println("Start Main method\n");
		
		Runnable IM = new imran("MD IMRAN HOSSAIN");
        Thread TH = new Thread(IM);
		TH.start();
		
		try {
			TH.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		Runnable IMm = new imran("BABU");
		Thread THh = new Thread(IMm);
		THh.start();
		try {

			THh.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		System.out.println("\nEnd main method");
	}

}
