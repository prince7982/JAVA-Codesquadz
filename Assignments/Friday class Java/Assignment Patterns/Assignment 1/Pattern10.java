/*
Print this pattern

1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/


class Pattern10
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
			for(int j=i+1;j<=n;j++)
			{
				System.out.print((j)+" ");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>0;i--)
		{
			for(int j=n-i;j<n-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print((j)+" ");
			}
			System.out.println();
		}
	}
}