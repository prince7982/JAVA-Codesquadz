/*
Print this Pattern

*****
*   *
*   *
*   *
*****

*/

class Pattern39
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{	
			for(j=1;j<=rows;j++)
			{
				// Print star only on boundary
				if(i==1 || i==rows || j==1 || j==rows)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}