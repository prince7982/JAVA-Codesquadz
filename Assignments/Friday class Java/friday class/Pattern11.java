class Pattern11
{
	public static void main(String... s)
	{
		int i,j,n;
		n=new java.util.Scanner(System.in).nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print((i)+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}