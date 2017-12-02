
public class IncrementDecrement {

	public static void main(String[] args) {
		int x,y,z,sum,sum1;
		x=20;
		y=15;
		z=2;
		
		
		System.out.println("Now showing pre increment");
		
		System.out.println(z);
		System.out.println(++z);
		System.out.println(z);
		
		System.out.println("Now showing post increment");
		
		z=2;
		System.out.println(z);
		System.out.println(z++);
		System.out.println(z);
		
		
		System.out.println("Showing pre Decrement");
		
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x);
		
		
		System.out.println("Showing Post Decrement");
		x=20;
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);
		
		 x=10;
		 y=5;
		sum = ++y+x-1;
		System.out.println(sum);
		
		x=10;
		x++;
		sum=x+9;
		System.out.println(sum);
		
		x=10;
		
       
       sum=--x+1;
       System.out.println(sum);
       
       x=10;
       sum=x--+1;
       System.out.println(sum);
       
       sum1=x+1;
       System.out.println(sum1);
		

	}

}
