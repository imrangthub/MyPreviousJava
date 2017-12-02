class Student8{                         // Base Class  
	
	int Roll;
	String Name;
	
}


class Result extends Student8{                      //  Derived Class extends Student8
	float Mark;
	
	void SetData(){                        
		Roll=1001;                        // accessing Inherited member  
		Name= "Imran Hossain.";         // accessing Inherited member  
		Mark= 75.5f;              // accessing own member     
	}	
		
	void Display(){
		System.out.println("Student Roll No is "+Roll);
		System.out.println("Student name is "+Name);
		System.out.println("Student Mark is "+Mark);
	}
	
	
}




public class Inheritance_Interface {

	public static void main(String[] args) {
	
		Result R = new Result();
		R.SetData();
		R.Display();
	

	}

}
