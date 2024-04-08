package q617;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
	private String name;
	private int height;

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void print() {
		System.out.println(name + " " + height);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] person = new Person[5];
		for (int i = 0; i < person.length; i++) {
			// input
			String name = sc.next();
			int height = sc.nextInt();

			person[i] = new Person(name, height);
		}
		sc.close();

		// print
		for (int i = 0; i < person.length; i++) {
			person[i].print();
		}

		Arrays.sort(person, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				int oh1 = o1.getHeight();
				int oh2 = o2.getHeight();
				if (oh1 < oh2)
					return -1;
				else if (oh1 == oh2)
					return 0;
				else
					return 1;
			}
		});

		// print
		System.out.println("----------------------");
		for (int i = 0; i < person.length; i++) {
			person[i].print();
		}
	}
}