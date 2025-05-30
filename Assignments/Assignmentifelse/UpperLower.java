//11. Write a program to check whether a entered character is lowercase (a to z) or uppercase (A to Z).


import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Read a single character

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is UPPERCASE.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is LOWERCASE.");
        } else {
            System.out.println("The character is not an alphabet.");
        }
    }
}
