package TeaShop;

public class PriceCalculation {
	int GREENtea=25;
	int REDtea=100;
	int GINGERtea=5;
static	int Rat;
	float Price;
	
		
		
		
		 float TEA(String type, int numberofcopes){
			if (type.toLowerCase().equals("green tea")) {
				Rat=GREENtea;
				
			}else if (type.toLowerCase().equals("genger tea")) {
				Rat=GINGERtea;
				
			}else if (type.toLowerCase().equals("red tea")) {
				Rat=REDtea; 
				
		}else {
			System.out.println("No services");
		} 
			 Price=Rat*numberofcopes;
			 return Price;
	       
			
		}
	
		
		
	}
	
	
	
	
	


