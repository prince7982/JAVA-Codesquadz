/*
print this pattern

*****
****
***
**
*

*/
class Pattern2
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}