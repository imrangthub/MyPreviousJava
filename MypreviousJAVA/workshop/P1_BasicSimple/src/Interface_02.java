interface Basic{
	String Name="Imran";
	int Roll=101;
	void Display();
}


interface Result_1{
	float Mark=65;
	
}


class Student_1 implements Basic,Result_1{
	
	public void Display(){
		System.out.println("Name is "+Name);
		System.out.println("Roll is "+Roll);
		System.out.println("Mark is "+Mark);
		
	}
	
	
}

public class Interface_02 {

	public static void main(String[] args) {
		Student_1 S_1=new Student_1();
		S_1.Display();

	}

}
