
public class Array_01 {

	public static void main(String[] args) {
		
		int[] array={32,34,56,76,78,98,97,20};
		int searchVal=78;
		boolean found=false;
		
       for (int i=0; i < array.length; i++) {
			
			if (array[i]==searchVal) {
				found=true;
				
		
	     	}
	  }	
		if (found) {
				System.out.println("the value is in Array: "+searchVal);
				
			}else {
				System.out.println("============ The value is not in Array ================");
			}
			
	}
}