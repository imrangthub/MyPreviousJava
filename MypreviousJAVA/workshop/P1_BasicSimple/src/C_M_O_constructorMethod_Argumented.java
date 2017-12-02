

class Student9{
	int Roll;
	String Name;
	float Mark;
	
	
	public Student9(int R, String N, float M){
		Roll=R;
		Name=N;
		Mark=M;
	}
	void Display(){
		
		System.out.println("Roll is :"+Roll);
		System.out.println("Name is: "+Name);
		System.out.println("Mark is: "+Mark);
	}
	
	
	
	
}
public class C_M_O_constructorMethod_Argumented {

	public static void main(String[] args) {
	 
		Student9 s9=new Student9(101, "Imran", 85f);
		s9.Display();

	}

}
