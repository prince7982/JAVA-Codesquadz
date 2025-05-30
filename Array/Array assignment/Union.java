package p1;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        // Input elements of first array
        System.out.println("Enter " + size1 + " elements for the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        // Input elements of second array
        System.out.println("Enter " + size2 + " elements for the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Find and print union of two arrays
        System.out.println("Union of the two arrays:");
        findUnion(arr1, arr2, size1, size2);
    }

    // Method to find union of two arrays without inbuilt functions
    public static void findUnion(int[] arr1, int[] arr2, int size1, int size2) {
        // Create a new array to store the union
        int[] unionArr = new int[size1 + size2];
        int index = 0;

        // Add all elements of arr1 to unionArr
        for (int i = 0; i < size1; i++) {
            if (!isDuplicate(unionArr, index, arr1[i])) {
                unionArr[index++] = arr1[i];
            }
        }

        // Add all elements of arr2 to unionArr (if not duplicate)
        for (int i = 0; i < size2; i++) {
            if (!isDuplicate(unionArr, index, arr2[i])) {
                unionArr[index++] = arr2[i];
            }
        }

        // Print the union array
        for (int i = 0; i < index; i++) {
            System.out.print(unionArr[i] + " ");
        }
    }

    // Method to check if an element is a duplicate
    public static boolean isDuplicate(int[] arr, int index, int element) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == element) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicate
    }
}
