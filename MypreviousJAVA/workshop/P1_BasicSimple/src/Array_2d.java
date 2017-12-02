import java.util.Scanner;

//    2    3    4
//    4    5    6




public class Array_2d {
	static Scanner MyScanner=new Scanner(System.in);

	public static void main(String[] args) {
		int TowDarray[][]=new int[2][3];
		TowDarray[0][0]=2;
		TowDarray[0][1]=3;
		TowDarray[0][2]=4;
		TowDarray[1][0]=4;
		TowDarray[1][1]=5;
		TowDarray[1][2]=6;
		
		
		TowDarray[1][0]=TowDarray[1][0]+TowDarray[1][2];
		System.out.println(TowDarray[1][0]);
		
		 
		int TowDarray_01[][]=new int[3][3];
		
		for (int Row = 0; Row < 3; Row++) {
			for (int coloum = 0;  coloum<3; coloum++) {
				TowDarray_01[Row][coloum]=MyScanner.nextInt();
				
				}
	   }
		
		for (int Row = 0; Row < 3; Row++) {
			for (int coloum = 0;  coloum<3; coloum++) {
				System.out.print(TowDarray_01[Row][coloum]+"\t");
				
				}
			System.out.println(" ");
		}
		
		

	}

}
