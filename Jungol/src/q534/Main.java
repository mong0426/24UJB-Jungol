package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char arb = sc.next().charAt(0);
		sc.close();
		
		// switch~case
		switch (arb){
			case 'A' :
				System.out.println("Excllent");
				break;
			case 'B' :
				System.out.println("Good");
				break;
			case 'C' :
				System.out.println("Usually");
				break;
			case 'D' :
				System.out.println("Effort");
				break;
			case 'F' :
				System.out.println("Failure");
				break;
			default :
				System.out.println("error");
				break;
				
		}
		
		// if~else
//		if( arb == 'A' ) {
//			System.out.println("Excellent");		
//			
//		} else if( arb == 'B' ) {
//			System.out.println("Good");		
//			
//		} else if( arb == 'C' ) {
//			System.out.println("Usually");		
//			
//		} else if( arb == 'D' ) {
//			System.out.println("Effort");		
//			
//		} else if( arb == 'F' ) {
//			System.out.println("Failure");		
//			
//		} else {
//			System.out.println("error");
//		}

	}

}
