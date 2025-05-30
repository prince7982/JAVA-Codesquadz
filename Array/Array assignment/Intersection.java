package p1;
import java.util.Scanner;

public class Intersection {
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

        // Find and print intersection of two arrays
        System.out.println("Intersection of the two arrays:");
        findIntersection(arr1, arr2, size1, size2);
    }

    // Method to find intersection of two arrays
    public static void findIntersection(int[] arr1, int[] arr2, int size1, int size2) {
        // Create an array to store the intersection
        int[] intersectionArr = new int[Math.min(size1, size2)];
        int index = 0;

        // Check for common elements in both arrays
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if the element is already added to avoid duplicates
                    if (!isDuplicate(intersectionArr, index, arr1[i])) {
                        intersectionArr[index++] = arr1[i];
                    }
                    break; // Move to the next element after finding a match
                }
            }
        }

        // Print the intersection array
        if (index == 0) {
            System.out.println("No common elements found.");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.print(intersectionArr[i] + " ");
            }
        }
    }

    // Method to check for duplicate elements
    public static boolean isDuplicate(int[] arr, int index, int element) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == element) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicate
    }
}
