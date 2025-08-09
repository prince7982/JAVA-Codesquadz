/*
Print this Pattern

54321
65432
76543
87654
98765


*/

class Pattern13
{
	public static void main(String... s)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n+i;j>=1+i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}