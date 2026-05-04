import java.util.Scanner;

class Student {
    String name;
    int m1, m2, m3;

    // Constructor
    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int total() {
        return m1 + m2 + m3;
    }

    double average() {
        return total() / 3.0;
    }

    String grade() {
        double avg = average();

        if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total());
        System.out.println("Average: " + average());
        System.out.println("Grade: " + grade());
    }
}

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        int count = 0;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All");
            System.out.println("3. Find Topper");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count == students.length) {
                        System.out.println("Student limit reached!");
                        break;
                    }

                    sc.nextLine(); // clear buffer
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter marks 1: ");
                    int m1 = sc.nextInt();

                    System.out.print("Enter marks 2: ");
                    int m2 = sc.nextInt();

                    System.out.print("Enter marks 3: ");
                    int m3 = sc.nextInt();

                    students[count] = new Student(name, m1, m2, m3);
                    count++;

                    System.out.println("Student added!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students available.");
                        break;
                    }

                    for (int i = 0; i < count; i++) {
                        students[i].display();
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No students available.");
                        break;
                    }

                    Student topper = students[0];

                    for (int i = 1; i < count; i++) {
                        if (students[i].total() > topper.total()) {
                            topper = students[i];
                        }
                    }

                    System.out.println("\n--- TOPPER ---");
                    topper.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
