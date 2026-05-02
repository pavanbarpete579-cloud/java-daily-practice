
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int roll;

    Student(String name, int roll) {
        super(name);
        this.roll = roll;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

public class Day5Inheritance {
    public static void main(String[] args) {

        Student s = new Student("Pavan", 101);
        s.display();
    }
}
