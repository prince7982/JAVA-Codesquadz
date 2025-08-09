/*
Print this Pattern

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
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(char j=(char)('A'+i);j<(char)('A'+n+i);j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}