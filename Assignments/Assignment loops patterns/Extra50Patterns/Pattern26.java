/*
Print this Pattern

Enter The Number of Rows : 5

1
32
543
7654
98765

*/

class Pattern26
{
	public static void main(String... s)
	{
		int i,j,rows,temp,num=1;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			temp=num;
			for(j=1;j<=i;j++)
			{
				System.out.print(temp);
				temp--;
			}
			System.out.print("\n");
			num=num+2;
		}
	}
}