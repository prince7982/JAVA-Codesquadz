/*
Print this pattern


*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          *


*/

class Pattern11
{
	public static void main(String... s)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j<=n;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=(n*2-2*i);j++)
			{
				System.out.print(" ");
			}
			for(int j=n-i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=(2*n+2);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=n-i;j<=n;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=(n*2-2*i);j++)
			{
				System.out.print(" ");
			}
			for(int j=n-i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}