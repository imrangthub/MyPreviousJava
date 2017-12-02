package Thread;

public class Thread_joining_00 {

	public static void main(String[] args) {
		System.out.println("Start Main Method.");

		MyThread th_1 = new MyThread();
		th_1.start();

		try {
			th_1.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("End Main Thread");

	}

}

class MyThread extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				sleep(500);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("IMRAN");

		}

	}

}