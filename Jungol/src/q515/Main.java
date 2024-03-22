package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int c = a*b;
		int d = a/b;
		
		System.out.println(a + " * " + b + " = " + c);
		System.out.println(a + " / " + b + " = " + d);
/* 강사님 코드		
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
*/
	}

}
