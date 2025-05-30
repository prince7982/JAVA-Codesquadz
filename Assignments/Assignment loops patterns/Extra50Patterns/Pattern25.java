/*
print this pattern

Enter The Number of Rows : 5

1
23
345
4567
56789

*/

class Pattern25
{
	public static void main(String... s)
	{
		int i,j,rows,num;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			num=i;
			for(j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.print("\n");
		}
	}
}