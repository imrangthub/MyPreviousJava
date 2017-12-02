interface Human{
	int Hight=5;
	String Name="babu";
	void Display();                           //   interface Method Defined.....
   }

interface Needed{
	String food="Mango";
	int money=100;
//	void getData();                                  // this function are deactivated, because it not define on Drive class Man_1.
}

class Man_1 implements Human,Needed{
	int weight=60;
	
	public void Display(){                       //        this Display() method is from interface Human.           
		}                                       // This Method not needed but we must have to defined it, if as Empty,not fact.
	
	
	
	void DataShow(){
		System.out.println(Name);
		System.out.println(Hight);
		System.out.println(weight);
		System.out.println(food);
	}
	
}

public class Interface_03 {

	public static void main(String[] args) {
		Man_1 m1=new Man_1();
	
		m1.DataShow();
		
		

	}

}
