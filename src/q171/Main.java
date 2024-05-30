package q171;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = 0;
		if(a>1000) {
			System.out.println("Error");
		}
		for(int i=1;i<=a;i++) {
			cnt = cnt+i;
		}
		System.out.println(cnt);
	}

}
