package q571;

import java.util.Scanner;

public class Main {

	public void printStr() {
		System.out.println( "~!@#$^&*()_+|");
	}

//	public static void printStr() {
//		System.out.println( "~!@#$^&*()_+|");
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
//		String b = "~!@#$^&*()_+|";
		
//		for(int i=0;i<a;i++) {
//			System.out.println(b);
//		}

		Main main = new Main();
		for(int i=0;i<a;i++) {
//			printStr();
			main.printStr();
		}
	}

}
