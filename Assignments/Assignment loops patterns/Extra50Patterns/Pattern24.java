/*
Print this Pattern

Enter The Number of Rows : 5

5
44
333
2222
11111

*/

class Pattern24
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=rows;i>=1;i--)
		{
			for(j=i;j<=rows;j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}