package q613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

//		Student st1 = new Student();
//		st1.setName(name);
//		st1.setSchool(school);
//		st1.setGrade(grade);
		
		Student st2 = new Student(name, school, grade);
		
//		System.out.println("Name : " + st2.getName());
//		System.out.println("School : " + st2.getSchool());
//		System.out.println("Grade : " + st2.getGrade());
		st2.print();
	}

}

class Student {
	private String name;
	private String school;
	private int grade;

	public Student(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}