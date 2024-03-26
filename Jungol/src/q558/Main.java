package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] cnt = new int[100];
		for (int i = 0; i< cnt.length; i++) {
			cnt[i] = -1;
		}
		int idx = 0;
		
		for(;;) {
			cnt[idx] = sc.nextInt();
			
			if(cnt[idx]==0) {
				
				break;
			}		
//			System.out.print(cnt[idx] + " ");
			idx++;
			sc.close();
		}
		for(int i=idx-1;i>=0;i--) {
			System.out.print(cnt[i] + " ");

			
		}

	}
}
