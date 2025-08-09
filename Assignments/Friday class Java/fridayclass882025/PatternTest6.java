class PatternTest6
{
	public static void main(String... s)
	{
		int n=7;
		for(int i=0;i<n;i++)
		{
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%4d",num);
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}