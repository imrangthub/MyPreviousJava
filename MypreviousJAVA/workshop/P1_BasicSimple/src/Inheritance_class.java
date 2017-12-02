

class MySupperCls_1{
	
	String Name;
	int Roll;
	float Mark;
	
	}

class MySupperCls_2 extends MySupperCls_1{
	
	void MyData(){
		Name="Imran";
		Roll=987;
		
		
	}
	void Display(){
		System.out.println("Name is: "+Name);
		System.out.println("Roll is: "+Roll);
	
	}
	
	
	
}


class MysupperCls_3 extends MySupperCls_2{
	float Assignment;
	
	void Mydd(){
	Mark=82;	
	Assignment=15;
	Mark=Mark+Assignment;
	
	}
	
	
         
	
	void Displas(){
		super.MyData();
		System.out.println("The Name is: "+Name);
		System.out.println("The Roll is: "+Roll);
		System.out.println("The Mark is: "+Mark);
	}
	
	
}






public class Inheritance_class {

	public static void main(String[] args) {
		
		MysupperCls_3 Obj_3=new MysupperCls_3();
		MySupperCls_2 Obj_2=new MySupperCls_2();
		Obj_2.MyData();
		Obj_2.Display();
		System.out.println("\n\n");
		Obj_3.Mydd();
		Obj_3.Displas();
		
		}

}
