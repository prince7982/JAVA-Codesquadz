/*
print this pattern

Enter the Number of Rows : 5

1
23
456
78910
1112131415

*/

class Pattern29
{
	public static void main(String... s)
	{
		int i,j,rows,num=1;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.print("\n");
		}
	}
}