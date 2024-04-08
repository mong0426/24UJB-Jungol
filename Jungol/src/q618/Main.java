import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Person[] person = new Person[5];
        for (int i = 0; i < person.length; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextInt();

            person[i] = new Person(name,height,weight);
        }
        sc.close();

        Arrays.sort(person, new Comparator<Person>(){
            public int compare(Person o1, Person o2){
                int oh1 = o1.getHeight();
                int oh2 = o2.getHeight();
            }

        });
        Arrays.sort(person, new Comparator<Person>(){
            public double compare(Person o1, Person o2){
                int oh1 = o1.getWeight();
                int oh2 = o2.getWeight();
            }

        });

    }

}

class Person {

    private String name;
    private int height;
    private double weight;

    public Person(String name, int height, double weight) {
        this.name = this.name;
        this.height = this.height;
        this.weight = this.weight;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight(){
        return weight;
    }
}