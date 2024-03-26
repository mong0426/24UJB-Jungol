package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		//System.out.println(num1);
		//System.out.println(num2);
		
		//1.
		double[] avg2 = {85.6,79.5,83.1,80.0,78.2,75.0};
		
		double sum = avg2[num1-1] + avg2[num2-1];
		System.out.println(sum);
		
		//2.
		/*
		double[] avg = new double[6];
		avg[0] = 85.6;
		avg[1] = 79.5;
		avg[2] = 83.1;
		avg[3] = 80.0;
		avg[4] = 78.2;
		avg[5] = 75.0;
		
		*/
		
		/*int[] cnt = new int[7];
		double[] ar = {0,85.6,79.5,83.1,80.0,78.2,75.0};
		
		
		for (int i=0;i<cnt.length;i++) {
			int cnt = sc.nextInt();
			double  = cnt
						
		}
		
		System.out.println(cnt[ar]); */
		
	}

}
