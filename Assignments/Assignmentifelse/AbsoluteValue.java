/*7. Write a program to print absolute value of a number entered by user. 
     Example
     INPUT:1   OUTPUT:1
     INPUT:-1  OUTPUT:1*/

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take input from user

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Read the number

        int absValue;

        if (num < 0) {
            absValue = -num;  // Make it positive if it's negative
        } else {
            absValue = num;   // If already positive, keep it as is
        }

        System.out.println("Absolute value: " + absValue);
    }
}
