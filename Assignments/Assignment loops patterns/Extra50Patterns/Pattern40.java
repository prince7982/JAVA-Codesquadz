/*
print this pattern

Enter The Number of Rows : 5

12345
2   4
3   3
4   2
54321

*/

class Pattern40
{
	public static void main(String... s)
	{
		int i,j,rows,k;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{	
	        if(i==rows)
				{
					for(k=rows;k>=1;k--)
					{
						System.out.print(k);
					}
				}
			else
			{
				for(j=1;j<=rows;j++)
				{
					if(i==1)
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
			}
			System.out.print("\n");
		}
	}
}