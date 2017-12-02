
public class ArrayOperation_03 {

	public static void main(String[] args) {
		
		int MyArray[]=new int[51];
		int i=0;
		while (i<51) {
			
			MyArray[i]=i;
			i++;
		}
		
		for (int j = 0; j < MyArray.length; j++) {
			System.out.println(MyArray[j]);	
		}
		
		
		
		
		

	}

}
