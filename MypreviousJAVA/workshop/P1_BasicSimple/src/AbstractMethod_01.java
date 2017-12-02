abstract class AbsSupperCls{
	String Name;
	int Roll;
	
	abstract void getData();                         // Abstract Method Declaration...
}

class AbsSubcls_01 extends AbsSupperCls{
	float Mark;
	
	@Override
	void getData() {                                    // Abstract Method Defined....
		Name="MD IMRAN HOSSAIN";
		Roll=101;
		Mark=85;
		
	}
	void Display(){
		System.out.println("The name of Student is: "+Name);
		System.out.println("Roll is: "+Roll);
		System.out.println("Exam mark: "+Mark);
	}
}


public class AbstractMethod_01 {

	public static void main(String[] args) {
		AbsSubcls_01 AsubC= new AbsSubcls_01();                   
		AsubC.getData();
		AsubC.Display();
	}

}
