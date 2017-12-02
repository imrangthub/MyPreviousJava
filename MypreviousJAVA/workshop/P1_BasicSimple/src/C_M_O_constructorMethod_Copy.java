class Student10{
	
	int Roll;
	String Name;
	float mark;
	
	public Student10(int r, String n,float m) {
		
		Roll=r;
		Name=n;
		mark=m;
	}
	
	public Student10(Student10 Cs) {
		
		Name=Cs.Name;
	//	Roll=Cs.Roll;
		mark=Cs.mark;
	}
	
	void Display(){
		
		System.out.println("Name is: "+Name);
		System.out.println("Roll is: "+Roll);
		System.out.println("Mark is: "+mark);
	}
	
	
}

public class C_M_O_constructorMethod_Copy {

	public static void main(String[] args) {
		
		System.out.println("Rocord No-01:\n");
		Student10 s10= new Student10(111, "MD Imran Hossain.", 90);
		s10.Display();
		
		System.out.println("\n\nRocord No-02:\n");
		
		Student10 ss10=new Student10(s10);
		ss10.Display();
		
		

	}

}
