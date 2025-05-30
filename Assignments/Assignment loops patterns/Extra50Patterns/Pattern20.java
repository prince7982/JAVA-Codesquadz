/*
Print this Pattern

*****
ABCDE
*****
ABCDE
*****

*/

class Pattern20
{
	public static void main(String... s)
	{
		int i,j,rows;
		char k='A';
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i%2==0)
				{
					System.out.print(k);
					k++;
				}
				else
				{
					System.out.print("*");
				}
			}
			k='A';
			System.out.print("\n");
		}
	}
}