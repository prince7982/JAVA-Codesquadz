/*
Print this Pattern

12345
23456
34567
45678
56789

*/

class Pattern7
{
	public static void main(String... s)
	{
		int n=5,count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(count);
				count++;
			}
			count=i+1;
			System.out.println();
		}
	}
}