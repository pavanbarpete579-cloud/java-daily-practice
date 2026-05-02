
class Day2 {

    // Problem 1
    static void evenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    // Problem 2
    static void largest(int a, int b, int c) {
        if (a == b && b == c)
            System.out.println("All are equal");
        else if (a >= b && a >= c)
            System.out.println("A is largest");
        else if (b >= c)
            System.out.println("B is largest");
        else
            System.out.println("C is largest");
    }

    // Problem 3
    static void grade(int marks) {
        if (marks >= 90)
            System.out.println("A");
        else if (marks >= 75)
            System.out.println("B");
        else if (marks >= 50)
            System.out.println("C");
        else
            System.out.println("Fail");
    }

    // MAIN
    public static void main(String[] args) {

        evenOdd(10);       // Problem 1
        largest(5,5,5);    // Problem 2
        grade(72);         // Problem 3
    }
}
