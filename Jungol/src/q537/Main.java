package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int i = 0;
		int sum = 0;
		while (i < num) {
			i++;
			sum = sum + i;

		}
		System.out.println(sum);

//		// 2번
//		int sum = 0;
//		for (int i = 0; i <= num; i++) {
//
//			sum += i;
//
//		}
//
//		System.out.println(sum);

	}

}
