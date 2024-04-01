package q615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[2];
		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();

//			System.out.println(name + " " + kor + " " + eng);
			stu[i] = new Student(name, kor, eng);
		}
		sc.close();

		// print
		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}

		// avg
		int sumKor = 0, sumEng = 0;
		for (int i = 0; i < stu.length; i++) {
			sumKor += stu[i].getKor();
			sumEng += stu[i].getEng();
		}
		System.out.println("avg " + (sumKor / stu.length) + " " + (sumEng / stu.length));
	}
}

class Student {
	private String name;
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
}
	
//		String name = sc.next();
//		int scr = sc.nextInt();
//		int scr1 = sc.nextInt();
//		String name1 = sc.next();
//		int scr2 = sc.nextInt();
//		int scr3 = sc.nextInt();
//		sc.close();
//
//		Student stu = new Student(name, scr, scr1, name1, scr2, scr3);
//
//		stu.print();
//		System.out.println("avg" + " " + ((scr + scr2) / 2) + " " + ((scr1 + scr3) / 2));
//	}
//
//}
//
//class Student {
//	private String name;
//	private int scr;
//	private int scr1;
//	private String name1;
//	private int scr2;
//	private int scr3;
//
//	public Student(String name, int scr, int scr1, String name1, int scr2, int scr3) {
//		this.name = name;
//		this.scr = scr;
//		this.scr1 = scr1;
//		this.name1 = name1;
//		this.scr2 = scr2;
//		this.scr3 = scr3;
//	}
//
//	public void print() {
//		System.out.println(name + " " + scr + " " + scr1);
//		System.out.println(name1 + " " + scr2 + " " + scr3);
//	}

