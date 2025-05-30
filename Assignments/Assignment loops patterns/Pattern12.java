/*
print this pattern

     *
    ---
   *****
  -------
 *********
-----------
 *********
  -------
   *****
    ---
     *

*/

class Pattern12
{
	public static void main(String... s)
	{
		int i,space,rows,k=0;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			
			while(k != 2*i-1)
			{
				if(i%2==0)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print("*");
				}
				k++;
			}
			k=0;
			System.out.print("\n");
		}
		
		
		for(i=rows-1;i>=1;i--)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			
			while(k != 2*i-1)
			{
				if(i%2==0)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print("*");
				}
				k++;
			}
			k=0;
			System.out.print("\n");
		}
	}
}