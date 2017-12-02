

class Student
{
	int Roll;
	String Name;
	float Mark;
                 void GetData()
                 {
                	 Roll=101;
                	 Name="Imran";
                	 Mark=80f;
                	 
                 }
                void Display()
                {
                	System.out.println("Roll is: "+Roll);
                	System.out.println("Name is: "+Name);
                	System.out.println("Mark is: "+Mark);
                	System.out.println("My name is Imran Hossain.");
                }

	
}








public class C_m_o_MethodFn {

	public static void main(String[] args) {
	
		Student S = new Student();
		S.GetData();
		S.Display();

	}

}
