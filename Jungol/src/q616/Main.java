package q616;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle tri = new Triangle();
		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			Point p = new Point(x, y);
			tri.setPoint(i, p);
		}
		sc.close();

//		tri.print();
		tri.printGravity();
	}
}

class Triangle {
	private Point[] p;

	public Triangle() {
		p = new Point[3];
	}

	public void setPoint(int idx, Point point) {
		p[idx] = point;
	}

	public void print() {
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}

	public void printGravity() {
		double x = 0.0, y = 0.0;

		for (int i = 0; i < p.length; i++) {
			x += p[i].getX();
			y += p[i].getY();
		}

		System.out.printf("(%.1f %.1f)\n", x / p.length, y / p.length);
	}
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(x + " : " + y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
/*
 * Scanner sc = new Scanner(System.in); Point[] avr = new Point[3]; for(int
 * i=0;i<avr.length;i++) { int x = sc.nextInt(); int y = sc.nextInt();
 * 
 * 
 * // System.out.println(x + y); } sc.close(); int sumX = 0,sumY = 0; for(int
 * i=0;i<avr.length;i++) { sumX =+ avr[i].getX(); sumY =+ avr[i].getY(); }
 * System.out.println("(" + (sumX/3 + sumY/3 ) + ")" );
 * 
 * }
 * 
 * }
 * 
 * class Point { private int x; private int y;
 * 
 * public Point(int x, int y){ this.x = x; this.y = y; } public void setX() {
 * 
 * } public int getX() { // TODO Auto-generated method stub return x; }
 * 
 * public int getY() { // TODO Auto-generated method stub return y; } }
 */