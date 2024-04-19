package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int sum = 0;
//		double avg = 0;
//		int cnt = 0;
//		for (;;) {
//			int a = sc.nextInt();
//
//			if (a >= 0 && a <= 100) {
//				sum += a;
//				cnt++;
//
//			} else {
//				sc.close();
//				break;
//			}
//
//		}
//
//		avg = (double) sum / cnt;
//
//		System.out.println("sum : " + sum);
//		System.out.printf("avg : %.1f", avg);
		
		int sum = 0, inp = 0, cnt = 0;

		do {
			inp = sc.nextInt();
			sum += inp;
			cnt++;
		} while (0 <= inp && inp <= 100);
		sc.close();
		sum -= inp;
		cnt--;

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n", (double) sum / cnt);
		
	}

}
