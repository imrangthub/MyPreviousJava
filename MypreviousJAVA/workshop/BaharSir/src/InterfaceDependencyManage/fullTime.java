package InterfaceDependencyManage;

class fullTime implements Iwork {
	
	public void works(){
		System.out.println("Full Time working");
		
	}
}

class parTime implements Iwork{
	
	public void works(){
		System.out.println("Par time working.");
	}
}

class wikely implements Iwork{
	
	public void works(){
		System.out.println("weakly time working.");
	}
}


// Manager class

 class manage{
	 
	 Iwork w;
	 
	 public void setWorks(Iwork w){
		 this.w=w;
		 
	 }
	 public void manage(){
		w.works();
	 }
 }
 