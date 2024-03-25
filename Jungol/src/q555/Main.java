package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		for(int i=0;i<=18;i++) {
			System.out.print(input.substring(i,i+1));
		}
			
		/*
		char[] charr = new char[10];
		for (int i = 0; i < charr.length; i++) {
			charr[i] = sc.next().charAt(0);
		}
		sc.close();

		for (int i = 0; i < charr.length; i++) {
			System.out.print(charr[i] + "");
		} */
	}

}
