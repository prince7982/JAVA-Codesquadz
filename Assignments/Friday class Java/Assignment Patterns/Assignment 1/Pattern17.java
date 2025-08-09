/*
Print this Pattern

   *      *
  ***    ***
 *****  *****
**************

*/

class Pattern17
{
	public static void main(String... s)
	{
		int n=4;
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++)
				{
					System.out.print("*");
				}
				for(int j=1;j<=(2*n-2*i);j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}