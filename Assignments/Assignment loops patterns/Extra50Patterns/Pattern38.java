/*
print this pattern

Enter The Number of Rows : 5
*
**
***
****
*****

*/

class Pattern38
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{	
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}