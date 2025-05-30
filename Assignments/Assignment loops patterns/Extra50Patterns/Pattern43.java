/*
Print this Pattern

Enter the number of Rows : 5

12345
1234
123
12
1

*/

class Pattern43
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter the number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=0;i<rows;i++)
		{
			for(j=1;j<=rows-i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}