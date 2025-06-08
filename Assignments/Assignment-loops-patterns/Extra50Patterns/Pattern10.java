/*
print this pattern

    *
   * *
  * * *
 * * * *
* * * * *

*/

class Pattern10
{
	public static void main(String... s)
	{
		int i,space,j,rows;
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
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}