/*
print this pattern

*
--
***
----
*****
----
***
--
*

*/

class Pattern13
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		
		for(i=rows-1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}