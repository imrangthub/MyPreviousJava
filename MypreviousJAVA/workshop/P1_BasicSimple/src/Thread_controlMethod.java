
class MyThread_01 extends Thread{
	
	public void run(){
		
		for (int i = 1; i <=10; i=i+2) {
			
			System.out.println("Mythread_01 Number: "+i);
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		System.out.println(" End  First thread ");
		}
}


class MyThread_02 extends Thread{
	
	public void run(){
	for(int i=2; i<=10; i=i+2){
		
		System.out.println("Mythread_02 Number: "+i);
		try {
			sleep(0000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	   }
	System.out.println(" End  Second thread ");
	}
}







public class Thread_controlMethod {

	public static void main(String[] args) {
		System.out.println("Start Main Method.....\n");
		MyThread_01 th01=new MyThread_01();
		MyThread_02 th02 = new MyThread_02();
		th01.start();
		th02.start();
		
		System.out.println("End Main Method. //\\\\\n\n");
	}

}
