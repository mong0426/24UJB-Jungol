package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0, sum = 0;
		
		for (;;) { 
			int num = sc.nextInt();
						cnt++;
			sum += num;
//			System.out.println(num+" ");
			if (num>=100) {
				sc.close();
				break;
			}
		}
		System.out.println(sum);
		System.out.printf("%.1f\n", (double) sum / cnt);
	}

}
