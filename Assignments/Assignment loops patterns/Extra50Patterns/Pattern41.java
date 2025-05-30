/*
print this pattern

Enter The Number of Rows : 5

12345
2   4
3   3
4   2
12345

*/

class Pattern41
{
	public static void main(String... s)
	{
		int i,j,rows;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{	
			   for(j=1;j<=rows;j++)
				{
					if(i==1 || i==rows)
				    {
					System.out.print(j);
				    }
				    else if(j==1)
				    {
					System.out.print(i);
				    }
				    else if(j==rows)
				    {
					System.out.print(rows-i+1);
				    }
				    else
				    {
					System.out.print(" ");
				    }
				}
			System.out.print("\n");
		}
	}
}