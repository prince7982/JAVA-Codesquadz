/*
print this pattern

54321
54321
54321
54321
54321

*/

class Pattern11
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=rows;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}