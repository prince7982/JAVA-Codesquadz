// 9. Write a program to calculate HCF of two given number.

import java.util.Scanner;
class HCF
{
	public static void main(String... s)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1'st Number");
		int num1=sc.nextInt();
		
		System.out.println("Enter 2'nd Number");
		int num2=sc.nextInt();
		
		sc.close();
		
		//finding hcf using loop
		int hcf=1;
		int min=Math.min(num1,num2);  //Get the smaller number
		
		for(int i=1;i<=min;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;  //updated hcf
			}
		}
		
		//DIsplay Result
		System.out.println("HCF of " + num1 + " and " + num2 + " is = "+hcf);
	}
}