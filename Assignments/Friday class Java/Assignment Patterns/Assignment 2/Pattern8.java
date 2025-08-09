/*
Print this Pattern 

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
		int n=5;
		char a='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(a);
				a++;
			}
			a='A';
			System.out.println();
		}
	}
}