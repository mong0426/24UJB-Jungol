package q1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		if(num > num1) {
			for(int i=num;i>=num1;i--){
				for(int j=1;j<=9;j++) {
					if(j % 3 == 0) {
						System.out.printf(i + " * " + j + " =" + "%3d" + "   ", i*j);
						System.out.println(" ");
					}else {
						System.out.printf(i + " * " + j + " =" + "%3d" + "   ", i*j);
					}
					
				}
				System.out.println();
			}
			
		}else if (num < num1) {
			for(int i=num;i<=num1;i++){
				for(int j=1;j<=9;j++) {
					if(j % 3 == 0) {
						System.out.printf(i + " * " + j + " =" + "%3d" + "   ", i*j);
						System.out.println(" ");
					}else {
						System.out.printf(i + " * " + j + " =" + "%3d" + "   ", i*j);
					}
				}
				System.out.println();
			}
		}else if (num == num1) {
				for(int j=1;j<=9;j++) {
					if(j % 3 == 0) {
						System.out.printf(num + " * " + j + " =" + "%3d" + "   ", num*j);
						System.out.println(" ");
					}else {
						System.out.printf(num + " * " + j + " =" + "%3d" + "   ", num*j);
					}
				}
			}
		sc.close();
		}
		
	}


