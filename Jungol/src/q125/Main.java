package q125;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
//		for(int i=1;i<=num;i++) {
//			System.out.print(i + " ");
//		}
		
//		int i=1;
//		while (i<=num) {
//			System.out.print(i + " ");
//			i++;
//		}
		int i=1;
		do  {
			System.out.print(i + " ");
		} while (i++<num);

	}

}
