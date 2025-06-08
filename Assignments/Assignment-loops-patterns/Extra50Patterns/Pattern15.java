 /*
print this pattern

ABCDE
BCDEF
CDEFG
DEFGH
EFGHI

*/

class Pattern15
{
	public static void main(String... s)
	{
		int i,rows=5;
		char j;
		/*System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();*/
		
		for(i=0;i<rows;i++)
		{
			for(j=(char)('A'+i);j<(char)('A'+i+rows);j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}