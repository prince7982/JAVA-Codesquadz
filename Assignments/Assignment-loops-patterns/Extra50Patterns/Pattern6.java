/*
print this pattern

11111
00000
11111
00000
11111

*/

class Pattern6
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
				if(i%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.print("\n");
		}
	}
}