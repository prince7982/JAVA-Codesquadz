/*
Print this Pattern

ABCDE
FGHIJ
KLMNO
PQRST
UVWXY
Z

*/

class Pattern19
{
	public static void main(String... s)
	{
		char k='A';
		int i,j;
		
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(k<='Z')
				{
					System.out.print(k);
					k++;
				}
			}
			System.out.print("\n");
		}
	}
}