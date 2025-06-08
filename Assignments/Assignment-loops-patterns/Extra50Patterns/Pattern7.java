/*
print this pattern

12345
23456
34567
45678
56789

*/

class Pattern7
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=i;j<i+rows;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}