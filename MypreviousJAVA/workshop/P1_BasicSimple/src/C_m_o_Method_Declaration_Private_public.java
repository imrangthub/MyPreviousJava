

class Student2
{
	
	        int Roll;               //friendly type variable
	        int Roll2 = 111;                                  // friendly  variable
	        String name;
	private float Mark;    //private type variable access from other class,
									//  But no problem to- access with Member function/method.  
	
	
	
	void GetData()							// function/method Declaration
	{
	
	
			Roll = 101;
			name = "imran";
			Mark = 80;
	}		
			
			
	private  void Display1()					//private Mode function/method Declaration 
	
	{
		System.out.println("Student Information:- "+Roll+" "+name+" "+Mark+"\n");
	}
	
	
	
	 void Display2()									// function/method Declaration
	{
	System.out.println("Student Roll is:- "+Roll);
	System.out.println("Student Name is:-" +name);
	System.out.println("Student Mark is:- "+Mark);
	
	System.out.println("\n\n");
	Display1();                                       // indirect private function access  
	}
	 
	 
}



public class C_m_o_Method_Declaration_Private_public {

	public static void main(String[] args) {
		 
		 String name2="MD Imran hossain";

		 Student2 S = new Student2();      // Object Declaration _ S. _ from class Student2 
		 S.GetData();                          // Object calling .......      |  Other classes
	//	S.Display1();                        // Private Object calling..error |  member variable
		S.Display2();                       // Object calling ............    |       access
		                                                                     
		System.out.println(name2);         // Member variable access. ....| Same class member
	    
		System.out.println(S.Roll2);    // public variable access from other class
		
	}
	

}
