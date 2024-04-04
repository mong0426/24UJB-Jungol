package q572;

import java.util.Scanner;

public class Main {
	public double calArea(int r) {
		double area = r * r * 3.14;
		
		return area;
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			sc.close();
			
			Main m = new Main();
			double area = m.calArea(a);
			System.out.printf("%.2f\n", area);
	}	
}

/*
	class One {
		private int a;
		
		public One (int a) {
			this.a = a;
		}
		
		double sum = (double) a*a*3.14;
		
		public void print() {
			System.out.printf("%.2.f", sum);
		}
		
	}
	*/