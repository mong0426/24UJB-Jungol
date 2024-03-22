package q530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if (num >= 20) {
			System.out.println("adult");
		} else {
			System.out.println(20-num + " years later");
		}

	}

}
