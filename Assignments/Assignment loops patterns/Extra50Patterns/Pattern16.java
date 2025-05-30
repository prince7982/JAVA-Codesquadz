/*
print this pattern

EDCBA
FEDCB
GFEDC
HGFED
IHGFE

*/

class Pattern16
{
	public static void main(String... s)
	{
		int i,rows=5;
		char j;
		/*System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();*/
		
		for(i=0;i<rows;i++)
		{
			for(j=(char)('E'+i);j>=(char)('A'+i);j--)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}