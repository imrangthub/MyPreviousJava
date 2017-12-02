package TeaShop;

import java.util.Scanner;

public class MiniCafa {
	static Scanner  cafaScanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("<< ===========   Welcome to our Cafe    ========== >>\n\tPlease enter Choise your Item:\n");
		
		
		System.out.println("\n Tea\t\tCoffey\t\tSoftdrinks");
		
		ItemsClass Itmcls=new ItemsClass();
		String OrderNo_01=cafaScanner.nextLine();
		
		if (OrderNo_01.toLowerCase().equals("tea")) {
			Itmcls.Tea();
		} 
		
		
		
		else {
			System.out.println("============= No SERVIC ==========");

		}
		System.out.println("\n\n========== :Thank you for visiting our shop: ============");

	}

}
