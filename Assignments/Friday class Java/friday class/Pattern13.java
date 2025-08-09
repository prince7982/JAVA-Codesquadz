class Pattern13
{
	public static void main(String... s)
	{
		int i,j,n,count=1;
		System.out.print("Enter the number of rows ");
		n=new java.util.Scanner(System.in).nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((count)+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println();
	}
	
}