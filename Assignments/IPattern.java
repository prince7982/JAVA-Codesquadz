/*

      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4

*/

class IPattern
{
	public static void main(String... s)
	{
		int n=4,count;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print("  ");
			}
			count=i;
			for(count=i;count>=1;count--)
			{
				System.out.print(count+" ");
			}
            for(count=2;count<=i;count++)
			{
				System.out.print(count+" ");
			}					
			System.out.println();
		}
	}
}