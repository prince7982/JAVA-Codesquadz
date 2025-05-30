//4. Write a program to find the factorial value of any number entered through the keyboard.


import java.util.Scanner;
class Factorial
{
	public static void main(String... s)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int x=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of "+x+" is "+fact);
		
		
		sc.close();
	}
}