class ManeBase{
	int Roll;
	String Name;
	float Mark;
	
	void SetData(){
		Roll=222;
		Name="BaBu";
		Mark=80f;
	   }
	void Display(){
		System.out.println("The name is "+Name);
		System.out.println("The Roll no is "+Roll);
		System.out.println("The Exm Mark is "+Mark);
	}
	
  }
class Result1 extends ManeBase{
	void Display(){
		SetData();
		System.out.println("The name is "+Name);
	}
	
	
}







public class Method_Overriding {

	public static void main(String[] args) {
		Result1 r = new Result1();
		r.Display();

	}

}
