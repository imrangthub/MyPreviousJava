
public class Array_00 {

	public static void main(String[] args) {

			int MyArray[]=new int[8];
			
			
			for (int i = 0; i < 8; ++i) {
				
				MyArray[i]=i;
				System.out.print(MyArray[i]+" ");
			i++;	
			}
			System.out.print("\nMyArray");
			
			
			for (int i = 0; i < MyArray.length; i++) {
				System.out.print("["+MyArray[i]+"] ");
				
			}
		}
	}
