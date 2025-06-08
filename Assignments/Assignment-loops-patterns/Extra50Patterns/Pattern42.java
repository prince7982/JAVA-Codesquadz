/*
Print this Pattern

Enter The Number of Rows : 7

*******
**   **
* * * *
*  *  *
* * * *
**   **
*******

*/

class Pattern42
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		/*
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows;j++)
			{
				// Print '*' on boundary or diagonal positions
				if(i==1 || i==rows || j==1 || j==rows || i==j || i+j==rows+1)
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
		*/
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows;j++)
			{
				if(i==1)
				{
					System.out.print("*");
				}
				else if(i==rows)
				{
					System.out.print("*");
				}
				else if(j==1)
				{
					System.out.print("*");
				}
				else if(j==rows)
				{
					System.out.print("*");
				}
				else if(i==j)
				{
					System.out.print("*");
				}
				else if(i+j==rows+1)
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