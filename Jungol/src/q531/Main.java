package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double g = sc.nextDouble();
		sc.close();
		
		if (g<=50.80) {
			System.out.printf("Flyweight");
		} else if (g<=61.23) {
			System.out.println("Lightweight");
		} else if (g<=72.57) {
			System.out.println("Middleweight");
		} else if (g<=88.45) {
			System.out.println("Cruiserweight");
		} else {
			System.out.println("Heavyweight");
		}
	

		//System.out.printf("%.2f", g);
	}

}
