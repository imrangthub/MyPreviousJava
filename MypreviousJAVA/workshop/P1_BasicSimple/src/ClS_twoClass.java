class superCls_01{
	
	float Length;
	float Brtath;
	
	void getData(float a, float b){
		Length=a;
		Brtath=b;
	}

	
}


public class ClS_twoClass {

	public static void main(String[] args) {
		
		float Area;
		superCls_01 Cl=new superCls_01();
		Cl.getData(10, 5);
		Area=Cl.Length*Cl.Brtath;
		System.out.println(Area);

	}

}
