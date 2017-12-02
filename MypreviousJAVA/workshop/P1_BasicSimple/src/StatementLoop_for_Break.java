
public class StatementLoop_for_Break {

	public static void main(String[] args) {

		   int sum=0;
		   int sum1=0;
		   
		  Loop1:  for (int i = 0; i < 5; i++) {
		          sum=sum+i;
		        
	          for (int j = 0; j <3; j++) {
	        	 sum1=sum1+j; 
	        	 if(sum1==7)
	        		 break Loop1;
			}
	         
	}
		
		   System.out.println(sum+sum1);  
	
		

	}

}
