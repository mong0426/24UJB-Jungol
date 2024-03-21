package q514;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("height = ");
		int a = sc.nextInt();

		sc.close();
		System.out.println("Your height is " + a + "cm.");	

	}

}
/* 강사님 코드
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("height = ");
		int height = sc.nextInt();
		sc.close();
		
		System.out.println("Your height is ");	
		System.out.println(height + "cm.");

	}

}
*/