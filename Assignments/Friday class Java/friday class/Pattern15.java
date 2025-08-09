class Pattern15
{
	public static void main(String... s)
	{
		int i,j,n;
		System.out.print("Enter the number of rows ");
		n=new java.util.Scanner(System.in).nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}