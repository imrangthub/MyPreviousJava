
class Other_class{                                     //Declaration a new class
	
	int roll;
	int id;                                            // New class variable
	String naem;
	
	
	void newfn(){                                    // new class Object_01                                     
		
		System.out.println("I am new OtherClass");
	}                                                 // End object_01    
	
	
	 void newfn2(){                                 // new class Object_02 start...
		int x,y;
		x=5;y=4;
		multiplection(x, y);          // Calling method  from new class ( Other_class )
 }                                                     // End Object_02
	
	
	
	
	 static void multiplection(int a,int b){       // new class Method Declaration(Other_class)
		int sum;
		sum=a*b;
		System.out.println("Other Class Multiplesing is: "+sum);
	}                                                  // End Method Declaration.
	

}        //     End New class.  ( Other_class )








public class C_M_O_Calling_method_function {

	public static void main(String[] args) {
	   int	x=20;
	   int y=5;
		
		prln("Welcome to my Method calling");
		
		
		addition(x, y);             // calling self class method.....
		subtraction(x, y);                              // // calling  self class method.....
		
		
		Other_class Oth=new Other_class();    // Creating Other_class Object
		Oth.newfn();                                  //Accessing Other_class Object.....
		Oth.newfn2();                               // Calling Other_class Object.....
		Other_class.multiplection(x, y);              // Accessing Other_class Method.....

}  //End of main class Object./
	
	
	
	
	static void prln(Object myobj){                 // Creating self/main class method.
		System.out.println(myobj);
	}
	
	static void addition(int a, int b){
		int sum;
		sum=a+b;
		System.out.println(sum);
	}
	
	static void subtraction(int a, int b){
		int sum;
		sum=a-b;
		prln(sum);
		
	}                            // end of main Creating self/main class method./
	
	
	
  
}                              //  End of Main Class./
