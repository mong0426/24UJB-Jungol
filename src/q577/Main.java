package q577;

import java.util.Scanner;

public class Main {
	public static String result (int a, int b) {
		int big = 0, small = 0;
		if (a>b) {
			big = a / 2;
			small = b * 2;
			return Integer.toString(big) + " " + Integer.toString(small);
		}else {
			big = a * 2;
			small = b / 2;
			return Integer.toString(big) + " " + Integer.toString(small);	
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(result(a,b));
		}	
		
		
	}
	

