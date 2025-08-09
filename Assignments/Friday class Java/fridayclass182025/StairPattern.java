class StairPattern
{
	public static void main(String... s)
	{
		int i,j,sp,n;
		System.out.println("Enter the size");
		n=new java.util.Scanner(System.in).nextInt();
		
		sp=0;
		for(i=0;i<2*n;i++)
		{
			if(i<n)
			{
				System.out.printf("@");
				for(j=0;j<sp;j++)
				{
					System.out.printf(" ");
				}
				for(j=0;j<n;j++)
				{
					System.out.printf("*");
				}
				sp=sp+n-1;
				if(i+1==n)
				{
					System.out.printf("@");
					sp++;
				}
			}
			else if(i==n)
			{
				System.out.printf("@");
				for(j=0;j<sp;j++)
				{
					System.out.printf(" ");
				}
				System.out.printf("@");
			}
			else
			{
				for(j=0;j<sp+1;j++)
				{
					System.out.printf(" ");
				}
				System.out.printf("@");
			}
			//sp=sp+n-1;
			System.out.printf("\n");
		}
	}
}