/*
print this pattern

     *
    * *
   *   *
  *     *
 *       *
*         *
 *       *
  *     *
   *   *
    * *
     *

*/

class Pattern9
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter the number of rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=0;i<rows;i++)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			if(i>=1)
			{
				for(j=1;j<=2*i-1;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(i=rows;i>=0;i--)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			if(i>=1)
			{
				for(j=1;j<=2*i-1;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}