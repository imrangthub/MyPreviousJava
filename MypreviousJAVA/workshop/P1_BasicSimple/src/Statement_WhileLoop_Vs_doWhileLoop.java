
public class Statement_WhileLoop_Vs_doWhileLoop {

	public static void main(String[] args) {
		                                                    //       do {
         int i,j;                                          //           // do Something
         i=2;                                             //         } While ( condition );
         j=2;   
                                                               

         
         while (i<2) {
        	 System.out.println("While loop "+i);	 
			i++;
		}
         
         j=2;
         
         do {
			System.out.println("Do while loop: "+j);
		} while (i<2);
         
         
         
         
	}

}
