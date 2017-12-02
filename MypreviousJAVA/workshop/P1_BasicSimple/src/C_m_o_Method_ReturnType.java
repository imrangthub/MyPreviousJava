class Student3
 {
	
	int roll;
	String name;
	int mark;
	int total;
	
	void GetData()
	{
		roll=02;
		name="MD Imrn Hossain.";
		mark=85;
	}

	 int SetMark()                 //  Return Type Method....
	 {
		total=mark+5; 
		return (total);
		
	 }
	 
	 void display()
	 {
		 System.out.println("Student name is: " +name);
		 System.out.println(total);
	 }
	  
	
}









public class C_m_o_Method_ReturnType {

	public static void main(String[] args) {
		Student3 S= new Student3();
		S.GetData();
		S.SetMark();
		S.display();

	}

}
