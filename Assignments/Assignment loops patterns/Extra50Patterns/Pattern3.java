/*
print this pattern

11111
22222
33333
44444
55555

*/

class Pattern3
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows;j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}