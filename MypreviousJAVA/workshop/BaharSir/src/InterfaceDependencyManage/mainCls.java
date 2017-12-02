package InterfaceDependencyManage;

public class mainCls {

	public static void main(String[] args) {
		
		manage m=new manage();
		
		Iwork x=new fullTime();
		       m.setWorks(x);
		       m.manage();
		      
		      x=new parTime();
		       m.setWorks(x);
		       m.manage();
		      
		      x=new wikely();
		       m.setWorks(x);
		       m.manage();
		      
		      
		
		

	}

}
