package p1;
import java.util.Scanner;

public class Sort2DArrayWithoutSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare and initialize 2D array
        int[][] arr = new int[rows][cols];

        // Input elements for 2D array
        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Convert 2D array to 1D array
        int[] tempArr = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tempArr[index++] = arr[i][j];
            }
        }

        // Sort the 1D array using Bubble Sort
        for (int i = 0; i < tempArr.length - 1; i++) {
            for (int j = 0; j < tempArr.length - i - 1; j++) {
                if (tempArr[j] > tempArr[j + 1]) {
                    // Swap elements
                    int temp = tempArr[j];
                    tempArr[j] = tempArr[j + 1];
                    tempArr[j + 1] = temp;
                }
            }
        }

        // Convert sorted 1D array back to 2D array
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = tempArr[index++];
            }
        }

        // Print the sorted 2D array
        System.out.println("Sorted 2D Array in Ascending Order:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to next line
        }
    }
}
