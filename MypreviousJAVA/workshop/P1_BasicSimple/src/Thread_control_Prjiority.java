
class Mythread01 extends Thread{
	public void run(){
		
		for (int i = 1; i<=10; i=i+2) {
			System.out.println("Mythread01 Step: "+i);
			try {
				sleep(0000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		System.out.println(" Close loop One");
	}
}

class Mythread02 extends Thread{
	public void run(){
		for(int i=2; i<=10; i=i+2){
			System.out.println("Mythread02 Step: "+i);
			try {
				sleep(0000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Close Loop Two");
	}
	
	
	
}











public class Thread_control_Prjiority {

	public static void main(String[] args) {
		Mythread01 th01=new Mythread01();
		Mythread02 th02= new Mythread02();
	    th02.setPriority(9);
		th01.start();
		th02.start();
		
		

	}

}
