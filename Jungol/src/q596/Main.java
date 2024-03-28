package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kor = sc.next();
		int num = sc.nextInt();
		sc.close();

		if (kor.length() > num) {

			int i = kor.length() - 1, cnt = 0;
			while (num > cnt) {
				System.out.print(kor.charAt(i));
				i--;
				cnt++;
			}

		} else {

			int i = kor.length() - 1; 
			while (i >= 0) {
				System.out.print(kor.charAt(i));
				i--;
				
			}
		}

	}

}
