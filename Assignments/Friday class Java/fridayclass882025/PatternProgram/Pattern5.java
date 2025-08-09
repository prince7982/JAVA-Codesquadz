class Pattern5
{
	public static void main(String... s)
	{
		int i,j,x,n,sp;
		System.out.println("Enter the size");
		n=new java.util.Scanner(System.in).nextInt();
		sp=n/2;
		x=n;
		if(n>1 && n%2!=0)
		{
			for(i=0;i<n/2+1;i++)
			{
				for(j=0;j<sp+i;j++)
				{
					System.out.printf(" ");
				}
				for(j=0;j<x;j++)
				{
					System.out.printf("@");
				}
				System.out.printf("\n");
				x-=2;
			}
			sp=n-2;
			for(i=0;i<n;i++)
			{
				System.out.printf("*");
				for(j=0;j<sp;j++)
				{
					if(i==0)
						System.out.printf("*");
					else
						System.out.printf(" ");
				}
				System.out.printf("*");
				System.out.printf("\n");
			}
		}
		else
		{
			System.out.printf("\n Invalid Input");
		}
	}
}