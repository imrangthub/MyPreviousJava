package myMobiles;

public class MobileSub_01 {
	public String CompanyName;
	public String ModelNo;
	public int StandbyMode;
	private String Passsword;
	
	
	
	public  MobileSub_01(){
		CompanyName=new String();
		ModelNo=new String();
		StandbyMode=0;
		Passsword=new String();
	}
	
	public MobileSub_01(String BrandName, String modelno, int batterybaclup, String password){
		CompanyName=BrandName;
		ModelNo=modelno;
		StandbyMode=batterybaclup;
		Passsword=password;
		
		
	}
	
	
	
	public String Brand(){
		return CompanyName;
	}
	public boolean password(String UserInput){
		return UserInput.equals(Passsword);
		
	}

}
