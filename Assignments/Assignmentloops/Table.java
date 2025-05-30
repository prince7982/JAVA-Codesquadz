/*3. Write a program that prompts the user to input a positive integer.
   it should then print the multiplication table of that number.*/

import java.util.Scanner; 
class Table
{
	public static void main(String... s)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int x=sc.nextInt();
		int y=0;
		System.out.println("Table of "+x+" is");
		
		for(int i=1;i<=10;i++)
		{
			y=x*i;
			System.out.println(x+"  X  "+i+"  =  "+y);
		}
		
		sc.close();
	}
}