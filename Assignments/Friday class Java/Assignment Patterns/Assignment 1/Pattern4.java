/*

print this pattern

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
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}