/*
Print this pattern

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/

class Pattern4
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter the no of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		
		for(i=rows-1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}