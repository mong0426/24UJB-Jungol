package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
//		인스턴스
		Study st1 = new Study();
		Study st2 = new Study(school, grade);
//		System.out.println(school);
//		System.out.println(grade);
		
		st1.print();
		st2.print();
	}	

}

class Study {
	private String school ;
	private int grade ;
// 생성자
	public Study() {
		this.school = "Jejuelementary";
		this.grade = 6;
	}
	
	
	public Study(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
//		pirnt method
	public void print() {
		System.out.println(grade + " grade in " + school + " School");
	}
	
}
