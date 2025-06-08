/*
print this pattern

1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

*/

class Pattern4
{
	public static void main(String... s)
	{
		int i,j,rows,num=1;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows;j++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.print("\n");
		}
	}
}