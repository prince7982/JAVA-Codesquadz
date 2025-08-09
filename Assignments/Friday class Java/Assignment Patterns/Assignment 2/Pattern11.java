/*
Print this Pattern

54321
54321
54321
54321
54321

*/

class Pattern11
{
	public static void main(String... s)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}