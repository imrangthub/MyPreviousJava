  class Student1
{
	private int Roll;
	private String Name = new String();
	
	private void GetData()
	{
		Roll = 101;
		Name = "BaBu";
		
	}
	public void Display()
	
	{
		GetData();                                            // accessing private function....
	System.out.println("The Name of Student is: "+Name);
	System.out.println("The Roll of Student is: "+Roll);
	
	}
}
	




public class C_M_O_ClsPrivate {

	public static void main(String[] args) {
		Student1 S=new Student1();
		S.Display();

	}

}
