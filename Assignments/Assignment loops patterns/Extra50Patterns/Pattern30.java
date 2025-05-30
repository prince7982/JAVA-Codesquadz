/*
print this Pattern

Enter The Number of Rows : 5

A
AB
ABC
ABCD
ABCDE

*/

class Pattern30
{
	public static void main(String... s)
	{
		int i,rows;
		char j='A';
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j='A';j<(char)('A'+i);j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}