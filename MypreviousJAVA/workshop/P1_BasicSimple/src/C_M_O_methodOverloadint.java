

class Student6{
	
	int Mymethod(int x){
		x=x*2;
		System.out.println("Using Integer type Mymethod with Single Argument");
		System.out.println("Double value is: "+x);
		return x;
		
	}
	
	
	int Mymethod(int x, int y){
		int z=x+y;
		prln("Using Integer type Mymethod with two Argument:");
		prln("Addition value is: "+z);
		return z;
	}
	float Mymethod(float x){
		x=x*2;
		prln("Usint float type Mymethod: ");
		prln("Double value is: "+x);
		return x;
		
	}
	
	String Mymethod(String num){
		num=num.toUpperCase();
		prln("Using String type method: ");
		prln("The Uppercase  name is: "+num);
		return num;
	}
	
	
	
	
	  static void prln(Object anyobject){
	       System.out.println(anyobject);	
	     }
}

















public class C_M_O_methodOverloadint {
     
	public static void main(String[] args) {
	 Student6 S = new Student6();

	  S.Mymethod(9);
	  S.Mymethod(3,2);
	  S.Mymethod(4.7f);
	  S.Mymethod("md imran hossain");
	  

	}
	
	
	

	
	
	
	
	
	

}
