
class DoubleValue{
	
	
	
	int Double(int Number){
		int D;
		D=Number*2;
		System.out.println("The Double value is "+Number+ " is "+D);
		return 0;
	}
	
	
	
	float Double(float number){
		float D;
		D=number*2;
		System.out.println("The Double value is "+ number + "is "+D);
		return 0;
	}
	
	
	int Double(int number1, int number2){
		int D1,D2;
		D1=number1*2;
		D2=number2*2;
		System.out.println("The Double "+number1+" is "+D1+" and The Doouble "+number2+" is "+D2);
		return 0;
				
	}
	
	
	
}






public class MethodOverloading {

	public static void main(String[] args) {
	
		DoubleValue Obj=new DoubleValue();
		Obj.Double(4);
		Obj.Double(5.5f);
		Obj.Double(6, 8);
		Obj.Double(10);
		Obj.Double(100, 6000);
		
		
		

	}

}
