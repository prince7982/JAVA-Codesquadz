/*
print this pattern

*********
 *     *
  *   *
   * *
    *
	
	
*/

class Pattern8
{
	public static void main(String... s)
	{
		int n=4;
		for(int j=1;j<=(2*n+1);j++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=n-1;i>=0;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			if(i>=1)
			{
				for(int j=1;j<=(2*i-1);j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}