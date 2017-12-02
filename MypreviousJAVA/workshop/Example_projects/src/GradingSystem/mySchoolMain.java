package GradingSystem;

import java.util.Scanner;

public class mySchoolMain {
	public static Scanner SchoolScan=new Scanner(System.in);

	public static void main(String[] args) {
		
	
		
		int Bangla,English,Math;
		
		System.out.println("Enter [3] Three Subjects  Number:(0 to 100)\n");
		System.out.print("Bangla: ");
		Bangla=SchoolScan.nextInt();
	if (Bangla>=0&&Bangla<=100) {
		
		System.out.print("English: ");
		English=SchoolScan.nextInt();
		if (English>=0&&English<=100) {
			
			System.out.print("Mathematic: ");
			Math=SchoolScan.nextInt();
			if (Math>=0&&Math<=100) {
				
				System.out.println("\n\nStudent Result is:\n");
				
				System.out.print("Bangla:\t\t");
				if (Bangla>39) {
					if (Bangla>=40&&Bangla<=49) {
						System.out.println("C");
						
					}else if (Bangla>=50&&Bangla<=69) {
						System.out.println("B");
						
					}else if (Bangla>=70&&Bangla<=79) {
						System.out.println("A");
					
					}else if (Bangla>=80) {
						System.out.println("A+");
					}
					
				}else {
					System.out.println("F");
				}
				
				System.out.print("English:\t");
				if (English>39) {
					if (English>=40&&English<=49) {
						System.out.println("C");
						
					}else if (English>=50&&English<=69) {
						System.out.println("B");
						
					}else if (English>=70&&English<=79) {
						System.out.println("A");
					
					}else if (English>=80) {
						System.out.println("A+");
					}
					
				}else {
					System.out.println("F");
				}
				
				System.out.print("Mathematic:\t");
				if (Math>39) {
					if (Math>=40&&Math<=49) {
						System.out.println("C");
						
					}else if (Math>=50&&Math<=69) {
						System.out.println("B");
						
					}else if (Math>=70&&Math<=79) {
						System.out.println("A");
					
					}else if (Math>=80) {
						System.out.println("A+");
					}
					
				}else {
					System.out.println("F");
				}
				
				
				System.out.println("----------------------------------------------");
				System.out.print("Total CGPA:\t");
				
				        if (Bangla>39&&English>39&&Math>39) {
				        	int Result=Bangla+English+Math;
				        	    if (Result>=40*3&&Result<=49*3) {
				        	    	System.out.println("C [PASSED]");
									
								}else if (Result>=50*3&&Result<=69*3) {
									System.out.println("B [PASSED]");
									
								}else if (Result>=70*3&&Result<=79*3) {
									System.out.println("A [PASSED]");
									
								} else {
									System.out.println("A+ [PASSED]");

								}
				        	
				        	
				        	
				        	
				        	
				        	
							
				        }else {
							System.out.println("[FAIL]");
						}

			         	
				
				
				
				}else {
					System.out.println("Invalide Input!");
				}
			
			
			
		      }else {
			System.out.println("Invalide Input!");
		}
		
			
		   }else {
			System.out.println("Invalide Input!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
