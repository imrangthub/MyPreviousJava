package MobileCompanyAboutClass_Interface_extend_Implement;

public class iPnone_Companny extends cellularPhone {
	
	String ModelName;
	int price;
	
	void iPnoneData(){
		BrandName="iPhone";
		PhoneType="Smart Phone";
		BatteryLifeTime=24;
	}

}

                                                        // Start phone creating.....
class iPhone_5 extends iPnone_Companny{
	
	void iPhone_5Data(){
		ModelName="iPhone 5";
		price=60000;
	}
	
	void Display(){
		iPnoneData();
		iPhone_5Data();
		System.out.println("Brand Name: "+BrandName);
		System.out.println("Phone Type: "+PhoneType);
		System.out.println("Model No: "+ModelName);
		System.out.println("Battery Life Time: "+BatteryLifeTime);
		System.out.println("Price: "+price);
	}
	
}

class iPhone_6 extends iPnone_Companny{
	
	void iPhone_5Data(){
		ModelName="iPhone 6";
		price=90000;
		BatteryLifeTime=20;
	}
	
	void Display(){
		iPnoneData();
		iPhone_5Data();
		System.out.println("Brand Name: "+BrandName);
		System.out.println("Phone Type: "+PhoneType);
		System.out.println("Model No: "+ModelName);
		System.out.println("Battery Life Time: "+BatteryLifeTime);
		System.out.println("Price: "+price);
	}
	
}
