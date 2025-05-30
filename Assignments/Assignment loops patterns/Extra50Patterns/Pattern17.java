/*
print this pattern

EEEEE
DDDDD
CCCCC
BBBBB
AAAAA

*/

class Pattern17
{
	public static void main(String... s)
	{
		int i,rows=5;
		char j;
		/*System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();*/
		
		for(j=(char)('E');j>=(char)('A');j--)
		{
			for(i=1;i<=rows;i++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}