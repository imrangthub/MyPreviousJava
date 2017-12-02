package Thread;

class MyRunnable00 implements Runnable {

	public void run() {

		for (int i = 1; i <= 50; i++) {

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("MD IMRAN HOSSAIN");

			if (i == 5) {
				break;

			}

		}

	}

}

public class RunnableThread_00 {

	public static void main(String[] args) {
		System.out.println("Start Main Method.");

		Runnable MyRn = new MyRunnable00();
		Thread Th00 = new Thread(MyRn);
		Th00.start();

	}

}
