
public class OperatorUse {

	public static void main(String[] args) {
		int x,y,z,sum;
		x=20;
		y=10;
		z=5;
		
		
		sum=x+y;
		System.out.println("Addition is "+sum);
		
		sum =x-z;
		System.out.println("Subtraction is "+sum);
		
		sum = x*y;
		System.out.println("Multiplexing is "+sum);
		
		sum = x/y;
		System.out.println("Division is "+sum);

		sum = (x-7)%y;
		System.out.println("The modula is "+sum);
		
		
		
		
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println("The logic is:- "+((x>y)&&(y<x)!=(z>6)));     //true && true = not false
																		//    1 AND 1  = 1
		
		System.out.println("The logic is:- "+((x>y)&&(y<x)==(z>6)));  	  //true && true=true
																		//   1 AND   1 = 0
		
		System.out.println("The other logic is:- "+((x==10)||(x==20)==(z==5))); //false OR true=true
																				// 0 OR 1 = 1
	}
	

}
