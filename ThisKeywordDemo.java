class Student {
    int id;
    String name;

    // Constructor using 'this'
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Pavan");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();
    }
}
