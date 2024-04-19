package q195;

import java.util.Scanner;


class Person {
	private String name;
	private String tel;
	private String addr;
	
	public Person(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		return;
	}
	public void print(){
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

}

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();

			sc.close();
			
			Person p = new Person(name, tel, addr);
			p.print();
			
		
		
	}
}

