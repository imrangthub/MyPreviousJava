import java.util.Scanner;



                                        //      try {
                                       //                 // do Something
                                      //         }catch(exception){
                                     //              //do something
                                    //        }finally{
                                   //                  // do Something even it is success
                                  //                      or filed
                                 //                  }


public class Try_Catch_Finally {       
	static Scanner MyScanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Start Our Program.\n\n");
		
		
			
		try {
			int MyArray[]=new int[3];
			MyArray[0]=100;
			MyArray[1]=200;
			MyArray[2]=300;
			
			System.out.print("What number index you want to see: ");
			
			int IN=MyScanner.nextInt();

			System.out.println("Do you want to see this Number: "+MyArray[IN]);
		
			
		} catch (Exception MyExceptions) {
			
		}finally {
			System.out.println("This is my Filally Statement");
		}
			
			
			
		
		
		
		
		
		System.out.println("End Our Program.");
		

	}

}
