/*
Print this Pattern

*****
22222
*****
44444
*****

*/

class Pattern9
{
	public static void main(String... s)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}