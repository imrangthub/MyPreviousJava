
public class DataTypeCast {

	public static void main(String[] args) {
	
		
		int x,y,z;
		
		x=5;
		y=2;
		z=x/y;
		
		System.out.print("Integer Number x= "+x);
		System.out.println("\tInteger Number y= "+y);
		
		System.out.println("When Integer x Convert to float x= "+(float)x);
		System.out.println((float)z);
		
		
		float p,q,r;
		
		p=5.5f;
		q=1.1f;
		System.out.println("float p is= "+p);
		System.out.println("\tfloat q is= "+q);
		System.out.println("Whern float p "+p+" Convert to int p= "+(int)p);
		
		
		r=(float)x/(float)y;
		
		System.out.println(r);
		
		
		

	}

}
