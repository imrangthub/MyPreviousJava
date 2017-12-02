package TeaShop;

import java.util.Scanner;

public class CashCounter {
	PriceCalculation pricCl=new PriceCalculation();
	static Scanner CashScanner=new Scanner(System.in);
	
	float teaCash(float CoustomerMoney,float totalprice){
		
			float Backmoney=CoustomerMoney-totalprice;
			return Backmoney;
			
		
	}

}
