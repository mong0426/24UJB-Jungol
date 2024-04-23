package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for(;;) {
			int a = sc.nextInt();
			
			if(a==0) {
				break;
			}else if (a%3 == 0 || a%5 == 0) {
				
			}else {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}

}
