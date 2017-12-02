
public class StatementlLoopWith_Labeled {

	public static void main(String[] args) {
		
		Loop_01:for (int i = 0; i <= 100; i++) {
			
			System.out.println("This is loop One: "+i);
			
			
			for (int j = 0; j <=100; j++) {
				int sum=0;
				sum=sum+j;
				System.out.println("This is loop Two:"+sum);
				if(i==2)
					break Loop_01;
			}
			
		}

	}

}
