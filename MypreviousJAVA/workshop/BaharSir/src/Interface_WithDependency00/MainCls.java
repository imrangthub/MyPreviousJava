package Interface_WithDependency00;

class works {
    
	public void works(){
		System.out.println("working Class");
		
	}
}

// Other class

   class manage{
        	
        	private works w;
        	
        	
        public void setWork(works w){
        	this.w=w;
        }
        
        public void manage(){
        	w.works();
        }
  }

public class MainCls {
	
	

	public static void main(String[] args) {
		works x=new works();
		
		   manage m=new manage();
		          m.setWork(x);
		          m.manage();
	
	}

}
