class Rocket
{
	public static void main(String... s)
	{
		int i,j,n,sp,x=1;
		
		System.out.println("Enter the size");
		n=new java.util.Scanner(System.in).nextInt();
		if(n>1 && n%2!=0)
		{
			//System.out.println(n/2+1);
			for(i=0;i<n/2+1;i++)
			{
				sp=n+n/2-i;      //sp=5+5/2-0=7  sp=5+5/2-1=6  sp=5+5/2-2=5
				
				for(j=0;j<sp;j++)
				{
					System.out.printf(" ");
				}
				for(j=0;j<x;j++)
				{
					System.out.printf("*");
				}
				x+=2;
				System.out.printf("\n");
			}
			for(i=0;i<n-2;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.printf(" ");
				}
				System.out.printf("@");
				for(j=0;j<n-2;j++)
				{
					System.out.printf(" ");
				}
				System.out.printf("@");
				System.out.printf("\n");
			}
			x=n;
			sp=n-2;
			for(i=0;i<n/2+1;i++)
			{
				for(j=0;j<i;j++)
				{
					System.out.printf(" ");
				}
				for(j=0;j<x;j++)
				{
					System.out.printf("*");
				}
				if(i==0)
					System.out.printf("@");
				for(j=0;j<sp;j++)
				{
					System.out.printf(" ");
				}
				if(i==0)
					System.out.printf("@");
				for(j=0;j<x;j++)
				{
					System.out.printf("*");
				}
				if(i==0)
					sp+=2;
				sp+=2;
				x-=2;
				System.out.printf("\n");
			}
		}
		else
		{
			System.out.printf("\n Invalid Input");
		}
	}
}