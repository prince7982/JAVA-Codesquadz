/*
Print this pattern

Enter the Number of Rows : 5

11111
2222
333
44
5

*/

class Pattern45
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows-i+1;j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}