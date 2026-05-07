import java.util.Scanner;

public class ArrayOperations {

    // Method to print array
    static void printArray(int arr[]) {
        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to find sum
    static int findSum(int arr[]) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    // Method to find largest element
    static int findLargest(int arr[]) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    // Method to find smallest element
    static int findSmallest(int arr[]) {
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    // Method for linear search
    static int linearSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        System.out.println("Sum = " + findSum(arr));

        System.out.println("Largest = " + findLargest(arr));

        System.out.println("Smallest = " + findSmallest(arr));

        double average = (double) findSum(arr) / size;
        System.out.println("Average = " + average);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = linearSearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
