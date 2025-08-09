/*
Print this Pattern

*****
 *****
  *****
   *****
    *****

*/


class Pattern19
{
	public static void main(String... s)
	{
		int n=5;
		{
			for(int i=0;i<n;i++)
			{
				for(int j=n-i;j<n;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}