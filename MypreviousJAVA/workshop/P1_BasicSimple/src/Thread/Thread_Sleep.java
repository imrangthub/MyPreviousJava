package Thread;

public class Thread_Sleep {

	public static void main(String[] args) {

		String Nm = "IMRAN";

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Nm);

		}

		int i = 0;
		while (true) {

			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Loop Step:  " + i++);

		}

	}

}
