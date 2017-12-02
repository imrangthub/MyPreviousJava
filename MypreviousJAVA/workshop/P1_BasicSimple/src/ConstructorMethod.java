

class MyConstructor{
	
	int Roll;
	float Mark;
	String Name;
	
	
	public MyConstructor(){
		
		Roll=202;
		Mark=86.5f;
		Name="MD IMRAN HOSSAIN";
		System.out.println("Student Name is "+Name);
		System.out.println("Student Roll is "+Roll);
		System.out.println("Student Mark is "+Mark);
		
	}
	
	
	
	public MyConstructor(int Number_1,int Number_2){
		int sum;
		sum=Number_1+Number_2;
		System.out.println("The Summeation is: "+sum);
		
		
		}
	
	public void Displays(){
		System.out.println("Daffodil International University");
		
	}
	
	
	
}









public class ConstructorMethod {

	public static void main(String[] args) {

		MyConstructor mc=new MyConstructor(48, 52);
		MyConstructor MC=new MyConstructor();
		MC.Displays();
		System.out.println(MC.Name);
		System.out.println(mc.Name);

	}

}
