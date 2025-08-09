/*
Print this pattern

    *
   ---
  *****
 -------
*********
 -------
  *****
   ---
    *

*/

class Pattern12
{
	public static void main(String... s)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i+1);j++)
			{
				if(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		for(int i=n;i>1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-3);j++)
			{
				if(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}