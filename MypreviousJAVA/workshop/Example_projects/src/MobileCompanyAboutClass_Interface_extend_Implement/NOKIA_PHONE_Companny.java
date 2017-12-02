package MobileCompanyAboutClass_Interface_extend_Implement;

class NOKIA_1100 extends NOKIA_PHONE_Companny{
	void Nokia_1100Data(){
		ModelNo="Nokia 1100";
		price=5500;
	}
	void Display(){
		NokiaDataNormal();
		Nokia_1100Data();
		
		System.out.println("Brand Name: "+BrandName);
		System.out.println("Phone Type: "+PhoneType);
		System.out.println("Model No: "+ModelNo);
		System.out.println("Battery Life Time: "+BatteryLifeTime);
		System.out.println("Price: "+price);
	}
	
}

class NOKIA_N70 extends NOKIA_PHONE_Companny{

	void N70Data(){
	     ModelNo="N70";
		 price=45000;
	}
	
	void Display(){
		NokiaDataMultiMedia();
		N70Data();
		
		System.out.println("Brand Name: "+BrandName);
		System.out.println("Phone Type: "+PhoneType);
		System.out.println("Model No: "+ModelNo);
		System.out.println("Battery Life Time: "+BatteryLifeTime);
		System.out.println("Price: "+price);
	}
	
}






public class NOKIA_PHONE_Companny extends cellularPhone{
	String ModelNo;
	int price;
	void NokiaDataMultiMedia(){
		BrandName="NOKIA";
		PhoneType="Multimedia";
		BatteryLifeTime=24;
		
	}
	
	void NokiaDataNormal(){
		BrandName="NOKIA";
		PhoneType="Normal";
		BatteryLifeTime=48;
	}

}
  
