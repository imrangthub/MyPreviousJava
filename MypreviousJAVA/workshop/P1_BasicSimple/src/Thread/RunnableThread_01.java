package Thread;

public class RunnableThread_01 {

	public static void main(String[] args) {

		System.out.println("Start Main Method Now.");

		Runnable aaaa = new MyRunnable_1();

		Thread Th01 = new Thread(aaaa);
		Th01.start();

		Runnable bbb = new MyRunnable_2();
		Thread TH02 = new Thread(bbb);
		TH02.start();

		System.out.println("End Main Method.");

	}

}

class MyRunnable_1 implements Runnable {
	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("First Loop, Step: " + i);

		}
	}
}

class MyRunnable_2 implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Second loop,Step:----------" + i);

		}
	}

}
