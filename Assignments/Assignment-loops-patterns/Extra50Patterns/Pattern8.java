/*
print this pattern

ABCDE
ABCDE
ABCDE
ABCDE
ABCDE

*/

class Pattern8
{
	public static void main(String... s)
	{
		int i,rows;
		char j;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j='A';j<='E';j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}