/*
print this pattern

EDCBA
EDCBA
EDCBA
EDCBA
EDCBA

*/

class Pattern18
{
	public static void main(String... s)
	{
		int i,rows;
		char j;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=0;i<rows;i++)
		{
			for(j=(char)('E');j>=(char)('A');j--)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}