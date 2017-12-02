package Thread;

public class RunnableThread_02 {

	public static void main(String[] args) {
		System.out.println("Start main method");

		Runnable aaa = new MyRannable01("aaa");
		Thread Th01 = new Thread(aaa);
		Th01.start();

		Runnable bbb = new MyRannable01("oo");
		Thread Th02 = new Thread(bbb);
		Th02.start();

		System.out.println("End maain Method");

	}

}

class MyRannable01 implements Runnable {

	String inputingvalue;

	public MyRannable01(String inputingvalue) {
		this.inputingvalue = inputingvalue;
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("Loop------" + inputingvalue);

		}

	}

}
