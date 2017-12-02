package Thread;

public class ThreadDefinedSuperCls_01 extends Thread {
	
	String ThreadName;
	int Counter;
	int AdditionValue;
	int StartPoint;
	int EndPoint;
	int DelayTime;
	boolean ThreadAlive;
	
	
//--------------------------------------------     Contractor Method      ----------------------------------------------//	
	public ThreadDefinedSuperCls_01(String threadName, int additionValue, int startPoint,int delayTime,
			boolean threadAlive) {
		super();
		ThreadName = threadName;
		AdditionValue = additionValue;
		StartPoint = startPoint;
		ThreadAlive = threadAlive;
		DelayTime=delayTime;
		
	}
	
	public void run(){
		Counter=StartPoint;
		while (!ThreadAlive==false) {
			try {
				sleep(DelayTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Counter+=AdditionValue;
		}
		
	}

	
	
	
	public void startThread(){
		ThreadAlive=true;
	}

	public void stopThtead(){
		ThreadAlive=false;
	}
	
		
	
	
	
//  -------------------------------------------------------    Getter and Setter Method      ----------------------------------//	

	public String getThreadName() {
		return ThreadName;
	}

	public void setThreadName(String threadName) {
		ThreadName = threadName;
	}

	public int getCounter() {
		return Counter;
	}

	public void setCounter(int counter) {
		Counter = counter;
	}

	public int getAdditionValue() {
		return AdditionValue;
	}

	public void setAdditionValue(int additionValue) {
		AdditionValue = additionValue;
	}

	public int getStartPoint() {
		return StartPoint;
	}

	public void setStartPoint(int startPoint) {
		StartPoint = startPoint;
	}

	public int getEndPoint() {
		return EndPoint;
	}

	public void setEndPoint(int endPoint) {
		EndPoint = endPoint;
	}

	public boolean isThreadAlive() {
		return ThreadAlive;
	}

	public void setThreadAlive(boolean threadAlive) {
		ThreadAlive = threadAlive;
	}
	
	//================    End getter and setter Method   =============//
	
	
	
	
	
	
	
	

}
