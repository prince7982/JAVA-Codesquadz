/*
Print this Pattern

Enter The Number of Rows : 5

1
21
321
4321
54321

*/

class Pattern28
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}