/*
Print this Pattern

12345
12345
12345
12345
12345

*/
class Pattern2
{
	public static void main(String... s)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}