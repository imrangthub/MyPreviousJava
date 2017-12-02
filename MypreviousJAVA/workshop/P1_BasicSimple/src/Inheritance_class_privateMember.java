

class SupperCls_1{
	
	private int Roll;                      //     private member
	String Name;
	
	void Getinfo(){
		Roll=101;
		Name="BaBu";
	}
	
	void Showinfo(){
		System.out.println("Roll is: "+Roll);
	}
	
	
	
}


class SupperCls_2 extends SupperCls_1{
	
	float Mark;
	
	
	void GetData(){
		Getinfo();
		Mark=82;
	}
	
	
	void Display(){
		Showinfo();
		System.out.println("Name is: "+Name);
		System.out.println("Mark is: "+Mark);
		
		
	}
		
		
	
}






public class Inheritance_class_privateMember {

	public static void main(String[] args) {
		SupperCls_2 OBJ=new SupperCls_2();
		OBJ.GetData();
		OBJ.Display();

	}

}
