package myMobiles;

public class MobileMain {
	static public MobileSub_01 MultimediaMobile;
	public static void main(String[] args) {
		
		MultimediaMobile=new MobileSub_01("NOKIA", "N8", 24, "abg");
		System.out.println(MultimediaMobile.CompanyName);
		System.out.println(MultimediaMobile.StandbyMode);

			
       System.out.println(MultimediaMobile.Brand());
       System.out.println(MultimediaMobile.password("ag"));
	}

}
