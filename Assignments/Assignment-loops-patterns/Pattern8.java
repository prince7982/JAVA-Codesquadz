/*
print this pattern

***********
 *       *
  *     *
   *   *
    * *
     *

*/
class Pattern8
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter number of rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows*2+1;i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		
		for(i=rows;i>0;i--)
		{
			for(space=0;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			if(i>1)
			{
				for(j=1;j<=2*i-3;j++)
				{
					System.out.print(" "); 
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}