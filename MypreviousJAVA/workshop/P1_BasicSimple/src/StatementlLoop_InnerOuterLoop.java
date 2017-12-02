import java.util.Scanner;

public class StatementlLoop_InnerOuterLoop {
	static Scanner mySc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Please input value: ");
		
		int MyArray[][]=new int [3][3];
		
		for (int i = 0; i <2; i++) {
			System.out.println("Enter  Row value: ");
			for (int j = 0; j < 3; j++) {
				MyArray[i][j]=mySc.nextInt();
				
			}
		}
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j <3; j++) {
				System.out.print(MyArray[i][j]+" ");
				
			}
			System.out.println("\n");
		}
		

	}

}
