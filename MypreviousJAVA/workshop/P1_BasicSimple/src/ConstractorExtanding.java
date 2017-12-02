








public class ConstractorExtanding{
	

	public static void main(String[] args) {
		
	Z zz=new Z(9);

		
	}

}

 class Z extends X{
	
	
	 public Z(){
		 System.out.println("This is Z default constractor Method\n");
	 }
	 
	 public Z(int tr){
		
		 
		 System.out.println("This is Z Argument constractor Method\n");
	 }
	 
	
	
}
 
 
 class X{
	 public X(){
		
		System.out.println("This is X default constractor Method\n");
	 }
	 
	 public X(int bgh){
		 System.out.println("This is X Argument constractor Method\n");
	 }
 }
 
