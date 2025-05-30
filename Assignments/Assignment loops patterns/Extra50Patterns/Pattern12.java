/*
print this pattern

55555
44444
33333
22222
11111

*/

class Pattern12
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=rows;j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}