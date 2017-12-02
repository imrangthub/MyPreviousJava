import java.util.Scanner;

public class NumberAssending {
	static Scanner MyScanners=new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] Myarray=new int[5];
		
		System.out.println("Enter the value for Assending: ");
		for (int i = 0; i < Myarray.length; i++) {
			Myarray[i]=MyScanners.nextInt();	
		}
		
		for (int i = 0; i < Myarray.length; i++) {
			System.out.println(Myarray[i]);
		}
		
		
		

	}

}
