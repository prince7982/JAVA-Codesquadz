// 7. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.


import java.util.Scanner;
class SumOfEvenOddIntegers
{
	public static void main(String... s)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers of Elements");
		int n=sc.nextInt();
		
		int evensum=0;
		int oddsum=0;
		
		System.out.println("Enter "+n+" integers :");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			
			if(num%2==0){
				evensum=evensum+num;
			}
			else{
				oddsum=oddsum+num;
			}
		}
		
		System.out.println("Sum of even numbers : "+evensum);
		System.out.println("Sum of odd numbers : "+oddsum);
		
		
		sc.close();
	}
}