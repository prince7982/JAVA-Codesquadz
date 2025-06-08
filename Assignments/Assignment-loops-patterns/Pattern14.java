/*
print this pattern

    *
   --
  ***
 ----
*****
 ----
  ***
   --
    *

*/

class Pattern14
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter the Number of Rows : ");
        rows=new java.util.Scanner(System.in).nextInt();
        
        for(i=1;i<=rows;i++)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}	
		
		for(i=rows-1;i>=1;i--)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}	
	}
}