

class SupperClss_01{
	int Roll_01;
	String Name;
	
	
	void GetDataa(){
		Roll_01=1001;
		Name="Imran";
	}
	
	void Displays(){
		System.out.println("The Name is: "+Name);
		System.out.println("The Roll is: "+Roll_01);
	}
	
}

class SupperClss_02 extends SupperClss_01{
	float Mark;
	void GetData(){
		Roll_01=111;
		GetDataa();
		Mark=820;
	}
	
	void Displays(){
		
		System.out.println(" Name is: "+Name);
		
		
	}
}





public class Method_Overriding_01 {

	public static void main(String[] args) {
		SupperClss_02 obj=new SupperClss_02();
		obj.GetData();
		obj.Displays();
	}

}
