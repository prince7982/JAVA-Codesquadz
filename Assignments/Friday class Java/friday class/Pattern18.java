class Pattern18
{
	public static void main(String... s)
	{
		int i,j,n;
		System.out.print("Enter the number of rows ");
		n=new java.util.Scanner(System.in).nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			if(i!=n)
			for(j=n;j<1;j--)
			{
				System.out.print(" ");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
}