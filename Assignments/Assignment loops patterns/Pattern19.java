/*
print this pattern

*****
 *****
  *****
   *****
    *****

*/

class Pattern19
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter the Numbers of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=rows;i>=1;i--)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=rows;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}