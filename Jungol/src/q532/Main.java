package q532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		double num1 = sc.nextDouble();
		
		sc.close();
		
		if ( num >= 4.0 && num1 >= 4.0) {
			System.out.println("A");
				} else if ( num >= 3.0 && num1 >= 3.0) {
					System.out.println("B");
				} else {
					System.out.println("C");
				} 
		
	}

}
