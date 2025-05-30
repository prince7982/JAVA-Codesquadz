/*
Print this Pattern

Enter The Number of Rows : 5

1
12
123
1234
12345

*/

class Pattern27
{
	public static void main(String... s)
	{
		int i,j,rows,num=1;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			num=1;
			for(j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.print("\n");
		}
	}
}