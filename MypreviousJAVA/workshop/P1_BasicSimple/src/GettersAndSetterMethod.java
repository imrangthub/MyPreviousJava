

public class GettersAndSetterMethod {
	static String Name;
	int Roll;
	float Mark;


	public static void main(String[] args) {
		
		setName("Imran hossain");
		System.out.println(getName());
		
		
		GettersAndSetterMethod GS=new GettersAndSetterMethod();
		GS.setRoll(110);
		GS.setMark(101f);
		System.out.println(GS.getRoll());
		System.out.println(GS.getMark());
		
	
	

	    }
	


	static public String getName() {
		return Name;
	}


	static public void setName(String name) {
		Name = name;
	}


	public int getRoll() {
		return Roll;
	}


	public void setRoll(int roll) {
		Roll = roll;
	}


	public float getMark() {
		return Mark;
	}


	public void setMark(float mark) {
		Mark = mark;
	}
	
}
