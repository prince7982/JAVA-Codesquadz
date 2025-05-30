/*
print this pattern

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
		int i,j,rows=5;
		/*System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();*/
		
		for(i=rows;i<10;i++)
		{
			for(j=i;j>i-rows;j--)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}