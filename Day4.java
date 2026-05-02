class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

class Day4 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Pavan");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();
    }
}
