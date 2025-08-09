class Pattern12
{
	public static void main(String... s)
	{
		int i,j,n;
		System.out.print("Enter the number of rows ");
		n=new java.util.Scanner(System.in).nextInt();
		for(i=0;i<n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print((j)+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}