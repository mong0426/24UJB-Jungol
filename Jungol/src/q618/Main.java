package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
	private String name;
	private int height;
	private double weight;

	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();

			p[i] = new Person(name, height, weight);
		}
		sc.close();

		// name sort
		System.out.println("name");
		Arrays.sort(p, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				String name1 = o1.getName();
				String name2 = o2.getName();

				int strlen = Math.min(name1.length(), name2.length());
				for (int i = 0; i < strlen; i++) {
					if (name1.charAt(i) != name2.charAt(i)) {
						return name1.charAt(i) - name2.charAt(i);
					}
				}
				return 0;
			}
		});

		// print
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}

		// weight sort
		System.out.println("weight");
		Arrays.sort(p, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				double weight1 = o1.getWeight();
				double weight2 = o2.getWeight();

				if (weight1 > weight2) {
					return 1;
				} else if (weight1 < weight2) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		// print
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}
}


import java.util.Scanner;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      info[] persons = new info[5];

      for (int i = 0; i < 5; i++) {
         String name = sc.next();
         int height = sc.nextInt();
         double weight = sc.nextDouble();

         persons[i] = new info(name, height, weight);

      }
      sc.close();
      
      
      
      Arrays.sort(persons, Comparator.comparing(info::getName));
      System.out.println("name");
      for (int i = 0; i < 5; i++) {

         persons[i].print();

      }

      
      System.out.println();
      
      
      System.out.println("weight");
      Arrays.sort(persons, Comparator.comparingDouble(info::getweight).reversed());
   
      for (int i = 0; i < 5; i++) {
         persons[i].print();
      }

   }

}


// 2nd logic
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
   static Map<String, Student> students = new HashMap<>();

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i < 5; i ++) {
         String name = sc.next();
         int height = sc.nextInt();
         float weight = sc.nextFloat();
         
         Student student = new Student(name, height, weight);
         students.put(name, student);
      }
      sc.close();
      // 이름 정렬
      List<Student> nameset = new ArrayList<>(students.values());
      Collections.sort(nameset, new Comparator<Student>() {

         @Override
         public int compare(Student s1, Student s2) {
            // TODO Auto-generated method stub
            return s1.getName().compareTo(s2.getName());
         }
      });
      System.out.println("name");
      for(Student student: nameset) {
         
         System.out.println(student.getName() + " " + student.getHeight() + " " + student.getWeight());
      }
      // 몸무게 정렬
      List<Student> valueset = new ArrayList<>(students.values());
      Collections.sort(valueset, new Comparator<Student>() {

         @Override
         public int compare(Student s1, Student s2) {
            // TODO Auto-generated method stub
            return Float.compare(s2.getWeight(), s1.getWeight());
         }
      });
      
      System.out.println();
      
      System.out.println("weight");
      for(Student student : valueset) {
         System.out.println(student.getName() + " " + student.getHeight() + " " + student.getWeight());
      }

   }

}
class Student {
   private String name;
   private int height;
   private float weight;
   
   public Student(String name, int height, float weight) {
      this.name = name;
      this.height = height;
      this.weight = weight;
   }
   
   public String getName() {
      return name;
   }
   
   public int getHeight() {
      return height;
   }
   
   public float getWeight() {
      return weight;
   }
}
