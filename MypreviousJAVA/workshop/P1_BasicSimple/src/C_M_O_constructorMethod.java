

class Student7{
	
	
	
	int Roll;
	String Name;
	float Mark;
	int ID;
	
	 public Student7() {                                          //  Constructor Method Defined .....
		Roll=101;
		Name="Imran";
		ID=132;
		Mark=85;
	}
	 
	 void getData(){                                // Not need this  getData()    Method 
		Roll=101;
		Name="Imran";
		ID=132;
		Mark=85;
	 }
	 
	void Display(){
		System.out.println("Student ID: "+ID);
		System.out.println("Name of Student is: "+Name);
		System.out.println("Stydent Roll is: "+Roll);
		System.out.println("Exame mark is: "+Mark);
	}
	
	
	
}


public class C_M_O_constructorMethod {

	public static void main(String[] args) {
		Student7 S = new Student7();
		
	//	 S.getData();                              // There was a Constructor Method, so not NEED S.getData(); Method calling.
	     S.Display();
	     
		
	
	

	}

}
