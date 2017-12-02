interface Students{
	
	static final int Roll=101;
	 static final String Name="Imran";
	 void Display();
}


class Results implements Students{
	float Mark=85;
	public void Display(){
	System.out.println("Student Name is "+Name);
	System.out.println("Roll is "+Roll);
	System.out.println("Mark is "+Mark);
		
	}
	
}
	


public class Interface_01 {

	public static void main(String[] args) {
		Results R=new Results();
		R.Display();
		

	}

}
