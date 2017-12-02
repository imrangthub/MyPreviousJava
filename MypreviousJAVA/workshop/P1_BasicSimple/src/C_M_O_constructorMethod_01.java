


class Rectangle{
	
	int length, width;
	
	Rectangle(int x, int y){
		length=x;
		width=y;
	}
	
	int Area(){
		int area=length*width;
		return area;
	}
	
	
}





public class C_M_O_constructorMethod_01 {

	public static void main(String[] args) {
		Rectangle Re=new Rectangle(20, 15);
		int MyArea=Re.Area();
		System.out.println(MyArea);

	}

}
