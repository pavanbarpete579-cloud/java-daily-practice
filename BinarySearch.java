import java.util.Scanner;

public class BinarySearch {

    // Method for binary search
    static int binarySearch(int arr[], int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            else if (arr[mid] < key) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Method to print array
    static void printArray(int arr[]) {

        System.out.println("Array Elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        }

        else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
