package TeaShop;

import java.util.Scanner;

public class ItemsClass {
	static Scanner ItemScanner=new Scanner(System.in);
	PriceCalculation priceCl=new PriceCalculation();
	CashCounter ccnt=new CashCounter();
	
	public  void Tea(){
		System.out.println("\nEnter category: Green Tea["+priceCl.GREENtea+"tk] \tRed Tea["+priceCl.REDtea+"tk] \t Ginger Tea["+priceCl.GINGERtea+"tk]");
		
		String teaCategory=ItemScanner.nextLine();
		if (teaCategory.toLowerCase().equals("green tea")||teaCategory.toLowerCase().equals("red tea")||teaCategory.toLowerCase().equals("ginger tea")) {
			
			System.out.println("How many coups do you want?");
	       int quentityofCoup=ItemScanner.nextInt();
			System.out.println("You Order "+quentityofCoup+" cpups of ["+teaCategory.toUpperCase()+"] Which is price is: "+priceCl.TEA(teaCategory, quentityofCoup));
			System.out.println("please pay first:");
			float customerMoney=ItemScanner.nextFloat();
			if (customerMoney<priceCl.TEA(teaCategory, quentityofCoup)) {
				System.out.println("Not enought Money");
				
				
			} else {
				System.out.println("Please take your mone: "+ccnt.teaCash(customerMoney, priceCl.TEA(teaCategory, quentityofCoup))+"tk");

			}
	
			
		
		} else {
			System.out.println(" Incurret Item\nWould you like try again:\tY for [yes]\tN for [No]");
			String Againtry=ItemScanner.nextLine();
			if (Againtry.toLowerCase().equals("y")) {
				Tea();
			   } else {
				   System.out.println("=========== See you later ========");

			}
			
			

		}
		
		
	}

}
