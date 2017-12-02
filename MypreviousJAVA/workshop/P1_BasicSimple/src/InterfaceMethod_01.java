
interface Book{
	String BookName_01="English";
	String BookName_02="Bangla";
	int Quentyti=10;
	void Dis();
			
}


interface Self{
	String Selft_1="RightSelft";
	String Selft_2="LeftSelft";
	
}


class Shope implements Book,Self{
	
	public void Dis(){
		System.out.println("The Book list on Shope As:\n\n ");
	}
	
	void ShowRoom(){
		System.out.println("Book : "+Selft_1+" On "+BookName_01);
		System.out.println("Book : "+Selft_2+" On "+BookName_02);
	}
	
	
}




public class InterfaceMethod_01 {

	public static void main(String[] args) {
		Shope MyShope_01=new Shope();
		MyShope_01.Dis();
		MyShope_01.ShowRoom();

	}

}
