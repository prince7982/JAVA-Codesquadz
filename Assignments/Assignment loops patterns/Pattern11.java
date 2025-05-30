/*
print this pattern

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *


*/

class Pattern11
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter the Number of rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		//upper part of the butterfly
		for(i=1;i<=rows;i++)
		{
			//left stars
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			//Spaces
			for(space=1;space<=2*(rows-i);space++)
			{
				System.out.print(" ");
			}
			
			//Right stars
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		//lower part of the butterfly
		for(i=rows;i>=1;i--)
		{
			//left stars
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			//Spaces
			for(space=1;space<=2*(rows-i);space++)
			{
				System.out.print(" ");
			}
			
			//Right stars
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}
}