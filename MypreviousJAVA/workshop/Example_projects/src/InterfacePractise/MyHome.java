package InterfacePractise;



interface HomeMeasurement{
	int HomeWidght=550;
	int Homeheight=80;
	void DisplayHome();
}


interface HomeVesil{
	String HomeType="Bulding";
	String HomeColor="Aqua";
	void DisplayHome();
	
}



class MyNewHome implements HomeMeasurement,HomeVesil{
	String HomeName="Price plaza";
	public void DisplayHome(){
		
	    System.out.println("Home Name: "+HomeName);
		System.out.println("Home Type: "+HomeType);
		System.out.println("Home Color: "+HomeColor);
		System.out.println("Home Height and Width: "+Homeheight+" by "+HomeWidght);
		
	}
	
}
public class MyHome{
	public static void main(String[] args) {
	MyNewHome Home_1=new MyNewHome();
	Home_1.DisplayHome();
		
	}

}
