/*
Print this Pattern

Enter The Number of Rows : 5

1
22
333
4444
55555

*/

class Pattern23
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
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}