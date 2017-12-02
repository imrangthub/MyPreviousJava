
class MyThread_1 extends Thread{
	
	public void run()
	{
		for (int i = 0; i<=5; i++) {
			System.out.println("MyThread_1 step: "+i);
		
			}
		
		System.out.println("\nExit from MyThread_1 Loop");
		
	}
}


class MyThread_2 extends Thread{
	
	public void run(){
		
		for (int i = 0; i <=10; i++) {
			
			System.out.println("MyThread_2 Step: "+i);
		
		}
		
		System.out.println("\nExit from MyThread_2 Loop");
		
	}
}

class MyThread_3  extends Thread{
	
	public void run(){
		for (int i = 0; i <=15; i++) {
			System.out.println("Mythread_3 Step: "+i);
		
		}
		System.out.println("\nExit from MyThread_3");
	}
	
}




public class ThreadMythread_2 {

	public static void main(String[] args) {
		
		MyThread_1 th1 = new MyThread_1();
		MyThread_2 th2 = new MyThread_2();
		MyThread_3 th3 = new MyThread_3();
		
		System.out.println("Start Mythread_1\n");
	    th1.start();
		
		System.out.println("Back to Main method");
		
		System.out.println("Start Mythread_2\n");
	    th2.start();
	    
	    System.out.println("Back to Main method");
	    
		System.out.println("Start MyThread_3\n");
		th3.start();
		
		System.out.println("End main() Method\n");
		
		
	}

}
