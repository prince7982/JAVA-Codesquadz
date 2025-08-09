class PatternTest7
{
	public static void main(String... s)
	{
		int n=6;
		for(int i=0;i<n;i++)
		{
			for(int space=i;space<n;space++)
			{
				System.out.printf(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num);
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}