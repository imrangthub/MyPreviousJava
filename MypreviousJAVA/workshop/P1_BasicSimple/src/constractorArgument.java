


class AA{
	{
		System.out.println("aaaaaaaaaaaaaaaa");
	}
	public  AA(){
		System.out.println("This is Only conetractor");
		
	}
	
	public AA(int num1){
		System.out.println("The is argument conastactor:"+num1*2);
		
	}
	public void dis(){
		System.out.println("This is Dis method");
	}
	
	
	{
		System.out.println("End of Class AA");
	}
}










public class constractorArgument{
	

	public static void main(String[] args) {
		System.out.println("This is Main method.\n\n");
		AA aaa=new AA(10);
		AA aaaa=new AA();
		aaa.dis();
		aaaa.dis();
		
	
	}

}
