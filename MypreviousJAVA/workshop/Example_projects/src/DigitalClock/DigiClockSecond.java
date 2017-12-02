package DigitalClock;

public class DigiClockSecond extends Thread{

	int HCounter;
	int MCounter;
	int SCounter;
	int Hour;
	int Minut;
	int Seconds;
	
	
	
	
	
	
	public void run(){
		
		//   Hour Loop...
		
	 for ( HCounter = 0;  HCounter<=24; HCounter++) {
			
			// Minute Loop...
			
			for (MCounter= 0; MCounter <=59; MCounter++) {
				
				//   Second loop...
				
				for (SCounter = 0; SCounter <= 59; SCounter++) {
					
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					
				}
				
				
				
					
					
			
				
				
			}
			
			if (HCounter==23) {
				HCounter=0;
				
			}
			
			
		}
		
	}






	public int getHCounter() {
		return HCounter;
	}






	public void setHCounter(int hCounter) {
		HCounter = hCounter;
	}






	public int getMCounter() {
		return MCounter;
	}






	public void setMCounter(int mCounter) {
		MCounter = mCounter;
	}






	public int getSCounter() {
		return SCounter;
	}






	public void setSCounter(int sCounter) {
		SCounter = sCounter;
	}






	public int getHour() {
		return Hour;
	}






	public void setHour(int hour) {
		Hour = hour;
	}






	public int getMinut() {
		return Minut;
	}






	public void setMinut(int minut) {
		Minut = minut;
	}






	public int getSeconds() {
		return Seconds;
	}






	public void setSeconds(int seconds) {
		Seconds = seconds;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
}
