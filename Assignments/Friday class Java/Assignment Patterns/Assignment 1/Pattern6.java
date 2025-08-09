/*
Print this Pattern

* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *


*/

class Pattern6
{
	public static void main(String... s)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=n-i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}