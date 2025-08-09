/*
Print this Pattern

12345
678910
1112131415
1617181920
2122232425


*/

class Pattern4
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
			System.out.println();
		}
	}
}