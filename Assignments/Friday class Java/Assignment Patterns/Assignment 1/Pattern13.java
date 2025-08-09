/*
Print this Pattern

*
- -
* * *
- - - -
* * * * *
- - - -
* * *
- -
*

*/

class Pattern13
{
	public static void main(String... s)
	{
		int n=5;
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=n-i;j<n;j++)
				{
					if(i%2==0)
					{
						System.out.print("- ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				System.out.println();
			}
			
			for(int i=n-1;i>=1;i--)
			{
				for(int j=n-i;j<n;j++)
				{
					if(i%2==0)
					{
						System.out.print("- ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				System.out.println();
			}
		}
	}
}