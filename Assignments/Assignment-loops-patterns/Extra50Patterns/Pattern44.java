/*
print this pattern

Enter The Number Of Rows : 5

54321
5432
543
54
5

*/

class Pattern44
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter The Number Of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=rows;i>=1;i--)
		{
			for(j=rows;j>rows-i;j--)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}