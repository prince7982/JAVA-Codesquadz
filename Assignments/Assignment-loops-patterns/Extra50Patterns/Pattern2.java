/*
print this pattern

12345
12345
12345
12345
12345

*/

class Pattern2
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}