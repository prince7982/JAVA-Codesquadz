/*

Print this Pattern

*-------*
 *-----*
  *---*
   *-*
    *

*/


class Pattern16
{
	public static void main(String... s)
	{
		int n=5;
		{
			for(int i=n;i>=1;i--)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				if(i>1)
				{
					for(int j=1;j<=(2*i-3);j++)
				    {
				        System.out.print("-");
				    }
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}